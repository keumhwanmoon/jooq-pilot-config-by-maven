package project.pilot.jooq.dealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.pilot.jooq.common.vo.ResponseVO;
import project.pilot.jooq.dealer.dto.DealerDTO;
import project.pilot.jooq.dealer.service.DealerService;

@RestController
public class DealerRestController {
    private final DealerService dealerService;

    @Autowired
    public DealerRestController(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    @PostMapping("/dealer")
    public ResponseVO register(@RequestBody  DealerDTO dealerDTO) {
        return ResponseVO.of("SUCCESS", dealerService.register(dealerDTO));
    }

    @GetMapping("/dealer/{dealerId}")
    public ResponseVO getOne(@PathVariable String dealerId) {
        return ResponseVO.of("SUCCESS", dealerService.getOne(dealerId));
    }

    @GetMapping("/dealer")
    public ResponseVO getList(@ModelAttribute DealerDTO dealerDTO) {
        return ResponseVO.of("SUCCESS", dealerService.getList(dealerDTO));
    }
}
