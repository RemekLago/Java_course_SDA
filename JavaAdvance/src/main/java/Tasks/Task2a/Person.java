package Tasks.Task2a;

public class Person {
    public String name;
    public String address;

    public Person(){

    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "(" + this.name + " -> " + this.address +")" ;
    }
}
