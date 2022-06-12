package Part3;

public class Auto {
    protected int speed;
    protected boolean lights = false;
    protected String color;
    protected String brand;
    int year;

    public Auto(int speed, String color, String brand, int year) {
        this.speed = speed;
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    public void accelerate() {
        if (this.speed + 10 > 120) {
            System.out.println("Speed limit is 120 km/h");
        } else {
            this.speed += 10;
            System.out.println("Accelerating to " + this.speed);
        }
    }

    public void lights() {
        this.lights = true;
    }

    public boolean isLightsTurnOn() {
        if (lights = false) {
            System.out.println("Lights are turn off");
        } else {
            System.out.println("Lights are turn off");
        }
        return lights;
    }

    public String toString() {
        return "{color:" + this.color + " brand: " + this.brand + " year: " + this.year + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Auto otherAuto = (Auto) obj;
            if (this.speed == otherAuto.speed && this.brand == otherAuto.brand
                    && this.color == otherAuto.color && this.year == otherAuto.year) {
                return true;
            }
        }
        return false;
    }
}


