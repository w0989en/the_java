package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    @Qualifier("hpPrinter")
    private Printer printer;

//    @Autowired
//    @Qualifier("canonPrinter")
//    private Printer printer;

//    private final Printer printer;
//    public MyController(@Qualifier("canonPrinter") Printer printer) {
//        this.printer = printer;
//    }

    @RequestMapping("/test")
    public String test(){
        printer.print("in Mycontroller...");
        return "Hi~~~~~";
    }
}
