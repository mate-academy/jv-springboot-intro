package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Value("${hw.hello}")
    private String hello;

    public String getHello() {
        return hello;
    }
}
