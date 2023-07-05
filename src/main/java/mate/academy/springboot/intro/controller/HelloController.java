package mate.academy.springboot.intro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final String HELLO_MESSAGE = "Hello, mates!";

    @GetMapping("/hello")
    public String doGet() {
        return HELLO_MESSAGE;
    }
}
