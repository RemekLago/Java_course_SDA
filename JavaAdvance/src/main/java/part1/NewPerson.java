package part1;

public class NewPerson{
    public String name;
    public int age;
    public char sex;

    public NewPerson(){
    }

    public NewPerson(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void introduce(){
        System.out.println("My name is " + this.name + ", I'm " + this.age + " years old");
    }

}