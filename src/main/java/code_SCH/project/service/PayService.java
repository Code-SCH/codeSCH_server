package code_SCH.project.service;

import code_SCH.project.domain.Pay;
import code_SCH.project.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {

    private final PayRepository payRepository;

    @Autowired
    public PayService(PayRepository payRepository) {
        this.payRepository = payRepository;
    }

    public void savePayData(Pay pay) {
        payRepository.save(pay);
    }
}
