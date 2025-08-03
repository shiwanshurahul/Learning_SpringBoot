package Shiwanshu.FirstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {

    @GetMapping("abc")     //localhost:8080/abc pe hi aa rha
public String sayHi(){
    return "Hi";
}
}
