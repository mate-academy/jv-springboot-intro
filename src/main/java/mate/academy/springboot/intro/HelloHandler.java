package mate.academy.springboot.intro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloHandler {
    @Value("${string.value}")
    private String value;

    String getValue() {
        return value;
    }
}
