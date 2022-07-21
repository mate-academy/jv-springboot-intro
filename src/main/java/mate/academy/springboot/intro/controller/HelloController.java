package mate.academy.springboot.intro.controller;

import mate.academy.springboot.intro.service.MateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MateService service;

    public HelloController(MateService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String sayHi() {
        return service.getKey();
    }
}
