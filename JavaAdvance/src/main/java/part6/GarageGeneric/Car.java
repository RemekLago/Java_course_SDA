package part6.GarageGeneric;

public class Car{
    private String brand, model, color;
    public boolean isParked;

    public String changeColor(String color) {
        return this.color = color;
    }

    public Car(String brand, String model, String color, boolean isParked) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isParked = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
