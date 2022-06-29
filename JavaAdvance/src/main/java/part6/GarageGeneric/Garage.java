package part6.GarageGeneric;

import java.util.Random;

public class Garage<T extends Car> {
    private T car1, car2;
    private final int parkingPlaces = 2;


    public void isParkingPlaceAvailable(T car) {
        boolean parkingPlace1, parkingPlace2; //    parkingPlace is available when true
        Random tmp = new Random();
        parkingPlace1 = tmp.nextBoolean();
        parkingPlace2 = tmp.nextBoolean();

        if (parkingPlace1 || parkingPlace2){
            car.isParked = true;
            System.out.println("The car have been parked");
        } else {
            car.isParked = false;
            System.out.println("Sorry parking is full");
        }

    }

    public void parkIn(T car) {
        car.isParked = true;
    }

    public void parkOut(T car) {
        car.isParked = false;
    }

    public Garage(T car1, T car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public T getCar1() {
        return car1;
    }

    public void setCar1(T car1) {
        this.car1 = car1;
    }

    public T getCar2() {
        return car2;
    }

    public void setCar2(T car2) {
        this.car2 = car2;
    }

}
