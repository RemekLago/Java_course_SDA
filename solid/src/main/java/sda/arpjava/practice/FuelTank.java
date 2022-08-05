package sda.arpjava.practice;

public class FuelTank extends Tank{
    public FuelTank(double capacity) {
        super(capacity);
    }

    public boolean isEmpty(){
        return level() == 0;
    }

    public double space(){
        return capacity - level();
    }
}
