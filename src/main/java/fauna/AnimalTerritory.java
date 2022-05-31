package fauna;

public class AnimalTerritory {
    private double x, y;

    public AnimalTerritory(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean canTravel(double x, double y) {
        if (x < -this.x || x > this.x) {
            return false;
        }

        if (y < -this.y || y > this.y) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
