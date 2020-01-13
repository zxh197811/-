package com.fh;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("helloSpringBoot")
    public String helloSpringBoot(){
        return "hello springBoot";
    }

}
