package part2;

public class Player{
    private final String name;
    public final int id;
    private int minSpeed;
    private int maxSpeed;
    private int distance;

    public Player(String name, int id, int minSpeed, int maxSpeed) {
        this.name = name;
        this.id = id;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public void introduce(){
        System.out.println("My name is " + this.name + ", my number is " + this.id + ".");
    }
    public double runTime(double length){
        double time = length / ((this.maxSpeed + this.minSpeed)/2);
        System.out.println("Player number " + this.id + ": distance " + length + " km in " + String.format("%.2f", time) + " hours");
        return time;
    }
    public void runDistance(double length){
        double time = length / ((this.maxSpeed + this.minSpeed)/2);
        double finalDistance = time * ((this.maxSpeed + this.minSpeed)/2);
        System.out.println("Player number " + this.id + ": distance " + finalDistance + " km in " + String.format("%.2f", time) + " hours");
    }

}
