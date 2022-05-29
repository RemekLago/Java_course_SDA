package classes.program;

import classes.Pies;

public class PiesProgram {
    public static void main(String[] args) {
        int value = 1;

        Pies burek = new Pies();
        // burek.rasa = "Labrador";
        burek.setZdenerwowanie(0);
        burek.szczekaj();

        Pies puszek = new Pies();
        puszek.szczekaj();

        Pies okruszek = null;
        // okruszek.szczekaj();

        for (int i = 0; i < 10; i++) {
            burek.szczekaj();
        }

        System.out.println("a");
    }
}
