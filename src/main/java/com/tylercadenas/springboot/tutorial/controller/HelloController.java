package com.tylercadenas.springboot.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component // Adds this class to Spring container
//@Controller// Does what @Component does AND more.
@RestController // Does what @Controller does AND EVEN MORE; always returns a response body -- see @ReponseBody annotation
public class HelloController {

        @RequestMapping(value = "/", method = RequestMethod.GET) //Whenever you hit localhost:8080/, you get this value.
        public String helloWorld() {
            return "Welcome to the human race.";
        }
}
