package my.service.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;


@RestController
@EnableWebMvc
public class PingController {
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public Map<String, String> ping() throws InterruptedException {
        Map<String, String> pong = new HashMap<>();
        Thread.sleep(1500);
        pong.put("pong", "Hello, World! after a bit of a wait");
        return pong;
    }
}
