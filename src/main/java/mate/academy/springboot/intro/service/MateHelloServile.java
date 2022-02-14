package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("userDetailService")
public class MateHelloServile {
    @Value("${mate.hello.message}")
    private String helloMessage;

    public String getMessage() {
        return helloMessage;
    }
}
