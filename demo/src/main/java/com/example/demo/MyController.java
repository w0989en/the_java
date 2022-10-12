package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//    @Autowired
//    private Printer printer;

    private final Printer printer;
    public MyController(Printer printer) {
        this.printer = printer;
    }

    @RequestMapping("/test")
    public String test(){
        printer.print("aaaa");
        return "Hi~~~~~";
    }
}
