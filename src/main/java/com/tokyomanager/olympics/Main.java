package com.tokyomanager.olympics;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ricardo Sanfelice
 */
@Controller
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
