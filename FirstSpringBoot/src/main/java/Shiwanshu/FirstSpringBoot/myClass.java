package Shiwanshu.FirstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {   //jo file ka name wo public class ka name

    @GetMapping("abc")     //localhost:8080/abc pe hi aa rha
public String sayHi(){
    return "Hi";
}   //mvn -> builds, manages dependency
    //pehle jar.original bnta jisme bas code hai, fir fat jar bnta jiisme dependency, packing sb hota and uska size > 3 times of original wala jar
}
//Car cr = new Car() = khud se bna rhe object
//ab spring se bnwa rhe = IOC container se = spring object dega       //IOC container me bahut sare objects hote
// Application context is a way to implement IOC container
//kisi class pe @component annotation hai toh us class ko rkh lega IOC
//spring bean -> object ko bolte jo IOC me hai -> @component wala
