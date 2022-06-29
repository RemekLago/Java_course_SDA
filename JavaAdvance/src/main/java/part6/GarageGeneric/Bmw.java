package part6.GarageGeneric;

public class Bmw extends Car {
    private Double price;
    private Double speed;

    public Bmw(String brand, String model, String color, Double price, Double speed, boolean isParked) {
        super(brand, model, color, isParked);
        this.price = price;
        this.speed = speed;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}
