package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloHandler {
    @Value("${string.value}")
    private String value;

    public String getValue() {
        return value;
    }
}
