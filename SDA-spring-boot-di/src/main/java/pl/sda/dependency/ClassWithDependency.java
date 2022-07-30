package pl.sda.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassWithDependency {

    //    @Autowired
    private Dependency dependency;


//    public ClassWithDependency(Dependency dependency) {
//        this.dependency = dependency;
//    }

    @Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public void printClassWithDependency() {
        System.out.println("In ClassWithDependency class");
        dependency.printDependency();
    }

}
