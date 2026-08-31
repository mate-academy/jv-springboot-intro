package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Value("${app.hello.value}")
    private String value;

    @Override
    public String sayHello() {
        return "Hello, " + value;
    }
}
