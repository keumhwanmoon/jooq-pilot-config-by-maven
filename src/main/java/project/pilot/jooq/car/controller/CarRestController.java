package project.pilot.jooq.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.pilot.jooq.car.dto.CarDTO;
import project.pilot.jooq.car.service.CarAdvertiseService;
import project.pilot.jooq.common.vo.ResponseVO;

@RestController
public class CarRestController {
    private final CarAdvertiseService carAdvertiseService;

    @Autowired
    public CarRestController(CarAdvertiseService carAdvertiseService) {
        this.carAdvertiseService = carAdvertiseService;
    }

    @GetMapping("/car/advertise/{carNo}")
    public ResponseVO getCarAdvertise(@PathVariable("carNo") int carNo) {
        return ResponseVO.of("SUCCESS", carAdvertiseService.getCarAdvertise(carNo));
    }

    @GetMapping("/car/advertise")
    public ResponseVO getCarAdvertiseList() {
        return ResponseVO.of("SUCCESS", carAdvertiseService.getCarAdvertiseList());
    }

    @PostMapping("/car/advertise")
    public ResponseVO registerCarAdvertise(@RequestBody CarDTO carDTO) {
        return ResponseVO.of("SUCCESS", carAdvertiseService.registerCarAdvertise(carDTO));
    }

    @PutMapping("/car/advertise")
    public ResponseVO modifyCarAdvertise(@RequestBody CarDTO carDTO) {
        return ResponseVO.of("SUCCESS", carAdvertiseService.modifyCarAdvertise(carDTO));
    }

    @DeleteMapping("/car/advertise/{carNo}")
    public ResponseVO deleteCarAdvertise(@PathVariable("carNo") int carNo) {
        return ResponseVO.of("SUCCESS", carAdvertiseService.deleteCarAdvertise(carNo));
    }
}
