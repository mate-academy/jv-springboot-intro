package mate.academy.springboot.intro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Value("${mate.academy.text}")
    private String mateValue;

    public String getMateValue() {
        return mateValue;
    }
}
