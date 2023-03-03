/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.
package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.MyService;

@RestController
public class MyController{
    MyService service = new MyService();

    @GetMapping("/")
    public String getString1(){
        return service.getString1();
    }

    @GetMapping("/about")
    public String getString2(){
        return service.getString2();
    }
}