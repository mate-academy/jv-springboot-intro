package mate.academy.springboot.intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Value("${massage.key}")
    private String massage;

    public String getMassage() {
        return massage;
    }
}
