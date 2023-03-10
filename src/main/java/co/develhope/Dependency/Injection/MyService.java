package co.develhope.Dependency.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("MyService()) has been constructor");
        this.myComponent = myComponent;
    }

    public String getName() {
        System.out.println("MyService.getName()) has been called");
        return myComponent.getMyComponentName();
    }

}
