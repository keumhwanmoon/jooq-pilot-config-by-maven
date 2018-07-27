package project.pilot.jooq.car.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.pilot.jooq.car.dto.CarDTO;

import java.util.Date;
import java.util.List;

import static project.pilot.jooq.model.tables.CarAdvertise.CAR_ADVERTISE;

@Repository
public class CarAdvertiseRepository {
    private final DSLContext dsl;

    @Autowired
    public CarAdvertiseRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public CarDTO getCarAdvertise(int carNo) {
        return dsl
                .select(CAR_ADVERTISE.CAR_NO,
                        CAR_ADVERTISE.MODEL_NO,
                        CAR_ADVERTISE.DETAIL_MODEL_NO,
                        CAR_ADVERTISE.GRADE_NO,
                        CAR_ADVERTISE.DETAIL_GRADE_NO,
                        CAR_ADVERTISE.CREATE_DATE,
                        CAR_ADVERTISE.LAST_UPDATE_DATE)
                .from(CAR_ADVERTISE)
                .where(CAR_ADVERTISE.CAR_NO.eq(carNo))
                .fetchOne()
                .into(CarDTO.class);
    }

    public List<CarDTO> getCarAdvertiseList() {
        return dsl
                .select(CAR_ADVERTISE.CAR_NO,
                        CAR_ADVERTISE.MODEL_NO,
                        CAR_ADVERTISE.DETAIL_MODEL_NO,
                        CAR_ADVERTISE.GRADE_NO,
                        CAR_ADVERTISE.DETAIL_GRADE_NO,
                        CAR_ADVERTISE.CREATE_DATE,
                        CAR_ADVERTISE.LAST_UPDATE_DATE)
                .from(CAR_ADVERTISE)
                .fetch()
                .into(CarDTO.class);
    }

    public int insertCarAdvertise(CarDTO carDTO) {
        return dsl
                .insertInto(CAR_ADVERTISE)
                .columns(CAR_ADVERTISE.CAR_NO,
                        CAR_ADVERTISE.MODEL_NO,
                        CAR_ADVERTISE.DETAIL_MODEL_NO,
                        CAR_ADVERTISE.GRADE_NO,
                        CAR_ADVERTISE.DETAIL_GRADE_NO,
                        CAR_ADVERTISE.CREATE_DATE)
                .values(carDTO.getCarNo(),
                        carDTO.getModelNo(),
                        carDTO.getDetailModelNo(),
                        carDTO.getDetailGradeNo(),
                        carDTO.getDetailGradeNo(),
                        new java.sql.Date(new Date().getTime())).execute();
    }

    public int updateCarAdvertise(CarDTO carDTO) {
        return dsl
                .update(CAR_ADVERTISE)
                .set(CAR_ADVERTISE.MODEL_NO, carDTO.getModelNo())
                .set(CAR_ADVERTISE.DETAIL_MODEL_NO, carDTO.getDetailModelNo())
                .set(CAR_ADVERTISE.GRADE_NO, carDTO.getGradeNo())
                .set(CAR_ADVERTISE.DETAIL_GRADE_NO, carDTO.getDetailGradeNo())
                .set(CAR_ADVERTISE.LAST_UPDATE_DATE, new java.sql.Date(new Date().getTime()))
                .where(CAR_ADVERTISE.CAR_NO.eq(carDTO.getCarNo()))
                .execute()
                ;
    }

    public int deleteCarAdvertise(int carNo) {
        return dsl
                .deleteFrom(CAR_ADVERTISE)
                .where(CAR_ADVERTISE.CAR_NO.eq(carNo))
                .execute();
    }
}
