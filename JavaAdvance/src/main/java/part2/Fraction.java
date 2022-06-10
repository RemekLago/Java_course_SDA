package part2;

public class Fraction {

    private int nominator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public void multiplication(Fraction other){
        this.nominator *= other.nominator;
        this.denominator *= other.denominator;
        System.out.println("Result of multiplication is: " + this.nominator + "/" + this.denominator);
    }

    public void division(int x, int y){
        this.nominator *= y;
        this.denominator *= x;
        System.out.println("Result of division is: " + this.nominator + "/" + this.denominator);
    }

    public void addition(int x, int y){
        this.nominator = (nominator*y + denominator*x);
        this.denominator = (denominator*y);
        System.out.println("Result of addition is: " + this.nominator + "/" + this.denominator);
    }

    public void subtraction(int x, int y){
        this.nominator = (nominator*y - denominator*x);
        this.denominator = (denominator*y);
        System.out.println("Result of subtraction is: " + this.nominator + "/" + this.denominator);
    }

    public String toString(){
        return nominator + "/" + denominator;
    }

}
