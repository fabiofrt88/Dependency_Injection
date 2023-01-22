package co.develhope.Dependency.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {


    private String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent()) has been constructor");
        this.myComponentName = "Fabio";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }


}
