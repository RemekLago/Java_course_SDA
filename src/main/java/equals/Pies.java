package equals;

public class Pies {
    private String rasa;
    private String imie;

    public Pies(String rasa, String imie) {
        this.rasa = rasa;
        this.imie = imie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pies pies = (Pies) o;

//        if (rasa != null) {
//            if (!rasa.equals(pies.rasa)) {
//                return false;
//            }
//        } else {
//            if (pies.rasa != null) {
//                return false;
//            }
//        }

//        boolean condition = rasa != null
//                ? !rasa.equals(pies.rasa)
//                : pies.rasa != null;
//
        if (rasa != null
                ? !rasa.equals(pies.rasa)
                : pies.rasa != null) {
            return false;
        }
        return imie != null ? imie.equals(pies.imie) : pies.imie == null;
    }
}
