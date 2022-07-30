package pl.sda.cycle;

import org.springframework.stereotype.Component;

@Component
public class ClassA {

    private ClassCommon classCommon;

    public ClassA(ClassCommon classCommon) {
        this.classCommon = classCommon;
    }
}
