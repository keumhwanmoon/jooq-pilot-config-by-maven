package project.pilot.jooq.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.pilot.jooq.car.dto.CarDTO;
import project.pilot.jooq.car.repository.CarAdvertiseRepository;

import java.util.List;

@Service
public class CarAdvertiseService {
    private final CarAdvertiseRepository carAdvertiseRepository;

    @Autowired
    public CarAdvertiseService(CarAdvertiseRepository carAdvertiseRepository) {
        this.carAdvertiseRepository = carAdvertiseRepository;
    }

    public CarDTO getCarAdvertise(int carNo) {
        return carAdvertiseRepository.getCarAdvertise(carNo);
    }

    public List<CarDTO> getCarAdvertiseList() {
        return carAdvertiseRepository.getCarAdvertiseList();
    }

    public int registerCarAdvertise(CarDTO carDTO) {
        return carAdvertiseRepository.insertCarAdvertise(carDTO);
    }

    public int modifyCarAdvertise(CarDTO carDTO) {
        return carAdvertiseRepository.updateCarAdvertise(carDTO);
    }

    public int deleteCarAdvertise(int carNo) {
        return carAdvertiseRepository.deleteCarAdvertise(carNo);
    }
}
