package code_SCH.project.config;

import code_SCH.project.repository.PayRepository;
import code_SCH.project.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private final PayRepository payRepository;
    @Autowired
    public AppConfig(PayRepository payRepository) {
        this.payRepository = payRepository;
    }
    @Bean
    public PayService payService() {
        return new PayService(payRepository);
    }
}
