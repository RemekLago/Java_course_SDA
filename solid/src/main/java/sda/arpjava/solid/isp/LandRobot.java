package sda.arpjava.solid.isp;

// Klasa implementujaca tylko jedna metode Walk z interfejsu
// Klasa narusza zasada ISP
public class LandRobot implements Amphibian{

    @Override
    public void swim() {
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }
}
