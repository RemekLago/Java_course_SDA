package classes;

public class Pies {

    public String rasa;
    private String imie;
    private int wielkosc;
    private int zdenerwowanie = 80;
    private int glod = 100;

    public void szczekaj() {
        if (zdenerwowanie < 50) {
            System.out.println("Nie mam ochoty szczekać");
            return;
        }

        System.out.println("Hau hau");
        zdenerwowanie -= 5;
    }

    public void nakarm(int iloscKarmy) {
        glod -= iloscKarmy;
    }

    public boolean czyGlodny() {
        boolean czyDalejGlodny = glod > 25;
        return czyDalejGlodny;
    }


}
