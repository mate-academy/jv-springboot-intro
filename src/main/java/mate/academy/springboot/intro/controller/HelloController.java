package mate.academy.springboot.intro.controller;

import mate.academy.springboot.intro.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String getHello() {
        return helloService.getHello();
    }
}
