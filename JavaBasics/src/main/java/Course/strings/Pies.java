package strings;

public class Pies {
    private final String rasa;
    private final String imie;

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

//    public void setRasa(String rasa) {
//        this.rasa = rasa;
//    }
}
