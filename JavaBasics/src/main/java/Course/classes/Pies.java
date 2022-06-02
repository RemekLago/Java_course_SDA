package classes;

public class Pies {

    private String rasa;
    private String imie;
    private int wielkosc;
    private int zdenerwowanie = 80;
    private int glod = 100;
    private boolean cokolwiek;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public boolean isCokolwiek() {
        return cokolwiek;
    }

    public void setCokolwiek(boolean cokolwiek) {
        this.cokolwiek = cokolwiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }

    public int getZdenerwowanie() {
        return zdenerwowanie;
    }

    public void setZdenerwowanie(int zdenerwowanie) {
        if (zdenerwowanie < 50) {
            // do nothing
            return;
        }
        this.zdenerwowanie = zdenerwowanie;
    }

    public int getGlod() {
        return glod;
    }

    public void setGlod(int glod) {
        this.glod = glod;
    }

    public void szczekaj() {
        if (zdenerwowanie < 50) {
            System.out.println("Nie mam ochoty szczekać");
            return;
        }

        System.out.println("Hau hau");
        this.zdenerwowanie -= 5;
    }

    public void nakarm(int iloscKarmy) {
        glod -= iloscKarmy;
    }

    public boolean czyGlodny() {
        boolean czyDalejGlodny = glod > 25;
        return czyDalejGlodny;
    }
}