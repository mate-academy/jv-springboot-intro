package mate.academy.springboot.intro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MateService service;

    public HelloController(MateService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return service.getKey();
    }
}
