package com.example.DockerApplication.controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


//    @Autowired
//    private StudentService studentService;

    @GetMapping("/check")
    public String verify(){
        return "it' working fine";
    }

//   @PostMapping("/upload")
//    public Student addStudent(@RequestBody Student student){
//        return studentService.add(student);
//
//   }

//    @GetMapping("/all")
//    public List<Student> getAllBooks() {
//        return studentService.getAllBooks();
//    }
}


//    git init
//    git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/saikumar182/Docker.git
//        git push -u origin main