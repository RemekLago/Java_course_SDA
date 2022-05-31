package strings;

public class Pies {
    private String rasa;
    private String imie;

    public Pies(String rasa, String imie) {
        this.rasa = rasa;
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "rasa='" + rasa + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}
