package sda.arpjava.solid.isp;

// Klasa zgodna z zasada ISP
public class WalkingRobot implements Walk{
    @Override
    public void walk() {
        System.out.println("Walk");
    }
}
