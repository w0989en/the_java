package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer{
    @Value("${printer.name}")
    private String name;

    @Value("${printer.countggg:20}")
    private int count;

    @PostConstruct  // init
    public void init(){
//        count = 5
    }

    @Override
    public void print(String message) {
        count--;
        System.out.println(name + "::" + message);
        System.out.println("HP print剩餘次數::" + count);
    }
}
