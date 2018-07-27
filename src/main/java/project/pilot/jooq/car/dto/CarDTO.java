package project.pilot.jooq.car.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class CarDTO {
    private int carNo;
    private String dealerId;
    private int makerNo;
    private String modelNo;
    private String detailModelNo;
    private String gradeNo;
    private String detailGradeNo;
    private String fuelCode;
    private String missionCode;
    private String placeNumber;
    private String carRegYear;
    private LocalDate applyDate;
    private int distanceAmount;
    private int saleAmount;

    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
}
