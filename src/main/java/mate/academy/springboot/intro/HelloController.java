package mate.academy.springboot.intro;

import mate.academy.springboot.intro.service.MateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MateService mateService;

    @Autowired
    public HelloController(MateService mateService) {
        this.mateService = mateService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, " + mateService.getValue();
    }

}
