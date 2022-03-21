package mate.academy.springboot.intro.controller;

import mate.academy.springboot.intro.service.MateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MateService mateService;

    public HelloController(MateService mateService) {
        this.mateService = mateService;
    }

    @GetMapping("/hello")
    public String sayHelloToMates() {
        return "Hello " + mateService.getMateValue();
    }
}
