package Shiwanshu.FirstSpringBoot.test;
//Shiwanshu.FirstSpringBoot hai and uske andar test folder me hai = allowed

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testSpring {

    @Autowired
    private Dog dog;  //import krlega Dog class se

        @GetMapping("/ok")
        public String ok(){
            return dog.fun();
//            return "ok";
    }
}

//Spring expects classes with @RestController and @GetMapping to be top-level public classes
//@autoWired -> dependency injection. provides required dependencies into your class.