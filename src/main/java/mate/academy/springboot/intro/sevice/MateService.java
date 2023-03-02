package mate.academy.springboot.intro.sevice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MateService {
    @Value("${mate.academy.key}")
    private String mateValue;

    public String getMateValue() {
        return mateValue;
    }
}
