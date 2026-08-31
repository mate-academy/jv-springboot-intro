package mate.academy.springboot.intro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${greeting}")
    private String greeting;

    @GetMapping("/hello")
    public String getHello() {
        return greeting;
    }
}
