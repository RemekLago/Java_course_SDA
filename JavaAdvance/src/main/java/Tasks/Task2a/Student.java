package Tasks.Task2a;

public class Student extends Person{
    private String studies;
    private int year;
    private double cost;

    public Student(String studies, int year, double cost){
        this.studies = studies;
        this.year = year;
        this. cost = cost;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString(){
        return this.studies+"-" + this.year+"-" + this.cost ;
    }
}
