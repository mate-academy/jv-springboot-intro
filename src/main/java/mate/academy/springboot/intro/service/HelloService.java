package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Value("${return.message}")
    private String serviceValue;

    public String getServiceValue() {
        return serviceValue;
    }
}
