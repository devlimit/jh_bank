package com.jh.bank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {
        @GetMapping("/hello")
        public String helloWorld() {
            return "hello!";
        }

}
