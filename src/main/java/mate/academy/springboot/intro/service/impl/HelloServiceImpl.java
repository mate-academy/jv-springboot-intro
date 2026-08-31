package mate.academy.springboot.intro.service.impl;

import mate.academy.springboot.intro.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String seyHello() {
        return "Hello, mates!";
    }
}
