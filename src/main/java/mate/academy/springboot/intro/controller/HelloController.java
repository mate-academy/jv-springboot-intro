package mate.academy.springboot.intro.controller;

import mate.academy.springboot.intro.service.MateHelloServile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private final MateHelloServile mateHelloServile;

    public HelloController(MateHelloServile mateHelloServile) {
        this.mateHelloServile = mateHelloServile;
    }

    @GetMapping
    public String sayHello() {
        return mateHelloServile.getMessage();
    }
}
