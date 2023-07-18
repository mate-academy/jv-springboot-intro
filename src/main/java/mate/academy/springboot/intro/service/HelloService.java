package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Value("${s}")
    private String message;

    public String getMessage() {
        return message;
    }
}
