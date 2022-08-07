package sda.arpjava.solid.isp;

public class UniversalRobot implements Amphibian {

    @Override
    public void swim() {
        System.out.println("Swim");
    }
    @Override
    public void walk() {
        System.out.println("Walk");
    }
}
