package com.project.api.Controllers;

import com.project.api.TestClass;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String Home()  {
        System.out.println("Hello world!");
        return "Hello world page";
    }

    @GetMapping("test")
    public String NewPage(){
        System.out.println("Some new page");
        return "Some new page";
    }

    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "Requestor-Type")
    @PostMapping("testPost")
    public TestClass TestPost(@RequestBody TestClass newInformation) {

        return newInformation;
    }

}
