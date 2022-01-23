package mate.academy.springboot.intro.controller;

import mate.academy.springboot.intro.service.MessageService;
import mate.academy.springboot.intro.service.MessageServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MessageService messageService;

    public HelloController(MessageServiceImpl messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/hello")
    public String getMassage() {
        return "Hello " + messageService.getMassage();
    }
}
