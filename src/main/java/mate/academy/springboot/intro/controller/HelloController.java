package mate.academy.springboot.intro.controller;

import mate.academy.springboot.intro.service.HelloHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloHandler helloHandler;

    public HelloController(HelloHandler helloHandler) {
        this.helloHandler = helloHandler;
    }

    @GetMapping("/hello")
    public String getValue() {
        return helloHandler.getValue();
    }
}
