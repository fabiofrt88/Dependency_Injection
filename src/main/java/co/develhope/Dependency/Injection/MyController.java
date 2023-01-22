package co.develhope.Dependency.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController()) has been constructor");
        this.myService = myService;
    }

    @GetMapping("/")
    public String get() {
        System.out.println("MyService.get() has been called");
        return "Welcome!";
    }

    @GetMapping("/getName")
    public String getMyService() {
        System.out.println("MyService.getName() has been called");
        return myService.getName();
    }
}
