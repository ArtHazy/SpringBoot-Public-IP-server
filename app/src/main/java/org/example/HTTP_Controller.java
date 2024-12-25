package org.example;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HTTP_Controller {
    @GetMapping(value = "/hi")
    @CrossOrigin
    byte[] greet(){
        try{
            var res = new File("D:\\CodeProjects\\Java\\personal-spring-server\\app\\src\\main\\resources\\h.html");
            var fis = new FileInputStream(res);
            var bytes = fis.readAllBytes();
            fis.close();
            return bytes;
        } catch (Exception e){}
        return "<h1>404</h1>".getBytes();
    }
}