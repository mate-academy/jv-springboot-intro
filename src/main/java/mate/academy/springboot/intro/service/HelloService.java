package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${mate.academy.hello}")
    private String helloValue;

    public String getValue() {
        return helloValue;
    }
}
