package classes;

public class PiesProgram {
    public static void main(String[] args) {
        int value = 1;

        Pies burek = new Pies();
        burek.szczekaj();
        burek.rasa = "Labrador";

        Pies puszek = new Pies();
        puszek.szczekaj();

        for (int i = 0; i < 10; i++) {
            burek.szczekaj();
        }

        System.out.println("a");
    }
}
