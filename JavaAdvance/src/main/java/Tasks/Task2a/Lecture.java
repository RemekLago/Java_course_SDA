package Tasks.Task2a;

public class Lecture extends Person{
    private String specialization;
    private double salary;


    public Lecture(String specialization, double salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return this.specialization+"-" + this.salary ;
    }
}
