package part6.GarageGeneric;

public class Main {
    public static void main(String[] args) {

        Bmw bmw1 = new Bmw("Bmw", "x4", "black", 20000.0, 190.0, false);
        Bmw bmw2 = new Bmw("Bmw", "x5", "white", 25000.0, 210.0, false);
        Porsche porsche1 = new Porsche("Porsche", "x5", "blue", 35000.0, 220.0, false);
        Porsche porsche2 = new Porsche("Porsche", "x5", "red", 45000.0, 250.0, false);

        Garage<Car> garage = new Garage<>(bmw1, porsche1);
        garage.parkIn(bmw1);
        garage.parkIn(porsche1);
        garage.parkOut(porsche1);

        garage.isParkingPlaceAvailable(porsche1);
    }
}
