package com.tylercadenas.springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component // Adds this class to Spring container
//@Controller// Does what @Component does AND more.
@RestController // Does what @Controller does AND EVEN MORE; always returns a response body -- see @ReponseBody annotation
public class HelloController {

        @GetMapping("/") // Notice that @GetMapping has the @RequestMapping annotation inside of it.
        public String helloWorld() {
            return "Welcome to the human race.";
        }
}
