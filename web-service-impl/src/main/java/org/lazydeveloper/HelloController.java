package org.lazydeveloper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/echo")
    public String hello() {
        logger.info("Hello worker called");
        return "Hello from worker";
    }

}
