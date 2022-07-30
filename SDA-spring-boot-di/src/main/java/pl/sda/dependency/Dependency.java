package pl.sda.dependency;

import org.springframework.stereotype.Component;

@Component
public class Dependency {

    public void printDependency() {
        System.out.println("In Dependency class");
    }

}
