package overload;

public class Overload {

    public Overload() {
    }

    public Overload(String sayHello) {

    }

    public Overload(int value) {

    }

    public void method(int param1, int param2) {

    }

    public void method(String param1, String param2) {

    }

    // typ nie jest częścią sygnatury metody
//    public int method(int param1, int param2) {
//
//    }
}
