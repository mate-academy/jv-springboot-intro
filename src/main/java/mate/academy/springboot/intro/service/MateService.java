package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MateService {
    @Value("${mate.academy.key}")
    private String key;

    public String getKey() {
        return key;
    }
}
