package Part3;

public class Cabriolet extends Auto {
    private boolean roofIsHide = false;

    public Cabriolet(int speed, String color, String brand, int year){
        super(speed, color, brand, year);
    }

    @Override
    public void accelerate() {
        if (this.speed + 10 > 180) {
            System.out.println("Speed limit is 180 km/h");
        } else {
            this.speed += 10;
            System.out.println("Accelerating to " + this.speed);
        }
    }

    public void roofHiding() {
        if (!roofIsHide) {
            roofIsHide = true;
        }
        else {
            roofIsHide = false;
        }
    }

    public boolean isRoofHide() {
        if (roofIsHide){
        System.out.println("Roof is hide: " + roofIsHide);
        }
        return roofIsHide;
    }

    @Override
    public String toString(){
        return "{color:" + this.color+ " brand: " + this.brand+ " year: " + this.year + "with hiding roof }";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Cabriolet otherCabriolet = (Cabriolet) obj;
            if (this.speed == otherCabriolet.speed && this.brand == otherCabriolet.brand
                    && this.color == otherCabriolet.color && this.year == otherCabriolet.year) {
                return true;
            }
        }
        return false;
    }
}
