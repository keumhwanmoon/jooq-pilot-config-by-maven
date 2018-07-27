package project.pilot.jooq.dealer.service;

import org.springframework.stereotype.Service;
import project.pilot.jooq.dealer.dto.DealerDTO;
import project.pilot.jooq.dealer.repository.DealerRepository;

import java.util.List;

@Service
public class DealerService {
    private DealerRepository dealerRepository;

    public int register(DealerDTO dealerDTO) {
        return dealerRepository.register(dealerDTO);
    }

    public DealerDTO getOne(String dealerId) {
        return dealerRepository.getOne(dealerId);
    }

    public List<DealerDTO> getList(DealerDTO dealerDTO) {
        return dealerRepository.getList(dealerDTO);
    }
}
