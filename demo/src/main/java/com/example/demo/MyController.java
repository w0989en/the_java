package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/")
@RestController
public class MyController {

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,
                        @PathVariable String name){
        System.out.println(id);
        return "ooo";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Test2 test2,
                        @RequestHeader(required = true, name = "Content-type") String contentType){
        System.out.println(test2.getId());
        System.out.println(contentType);
        return "qq";
    }

    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                        @RequestParam(defaultValue = "xx") String name){
        System.out.println("id::" + id);
        System.out.println("name" + name);
        return "xxx";
    }

    @RequestMapping("/user")
    public Student user(){
        Student student = new Student();
        student.setName("my wen");
        return student;
    }

    @RequestMapping("/product")
    public Store product(){
        Store store = new Store();
        List<String> mylist = new ArrayList<>();
        mylist.add("product_a");
        mylist.add("product_b");
        store.setProductlist(mylist);
        return store;
    }

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
