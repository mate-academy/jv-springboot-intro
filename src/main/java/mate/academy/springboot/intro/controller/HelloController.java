package mate.academy.springboot.intro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${mate.academy.message}")
    private String message;

    @GetMapping
    public String sayHello() {
        return message;
    }
}
