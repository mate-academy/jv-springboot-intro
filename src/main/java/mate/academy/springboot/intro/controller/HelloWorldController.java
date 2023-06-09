package mate.academy.springboot.intro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/index")
    String helloWorld() {
        return "Hello, world";
    }
}
