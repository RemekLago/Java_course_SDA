package Part3;

public class AutoMain {
    public static void main(String[] args) {

        Auto auto1 = new Auto(80, "white", "ford", 2000);
        Auto auto2 = new Auto(80, "white", "ford", 2000);
        Cabriolet cabriolet1 = new Cabriolet(150, "red", "toyota", 2010);
        Cabriolet cabriolet2 = new Cabriolet(150, "red", "toyota", 2010);

//        auto1.accelerate();
//        auto1.isLightsTurnOn();
//        cabriolet1.accelerate();
//        cabriolet1.accelerate();
//        cabriolet1.accelerate();
//        cabriolet1.accelerate();
//        cabriolet1.roofHiding();
//        cabriolet1.isRoofHide();

        System.out.println(auto1.toString());
        System.out.println(cabriolet1.toString());
        System.out.println(auto1.equals(auto2));
        System.out.println(cabriolet1.equals(cabriolet2));
    }
}
