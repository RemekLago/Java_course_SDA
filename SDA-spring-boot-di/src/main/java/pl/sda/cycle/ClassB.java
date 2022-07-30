package pl.sda.cycle;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

    private ClassCommon classCommon;

    public ClassB(ClassCommon classCommon) {
        this.classCommon = classCommon;
    }
}
