package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/students")
//    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String create(@RequestBody Student student){
        return "post...";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable String studentId){
        return "get...";
    }

    @PutMapping("/students/{studentId}")
    public String put(@PathVariable String studentId,
                      @RequestBody Student student){
        return "put...";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable String studentId){
        return "delete...";
    }
}
