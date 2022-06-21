package Part5.Instruments;

public class InstrumentsMain {
    public static void main(String[] args) {

        Guitar guitar1 = new Guitar();
        Piano piano1 = new Piano();
        Drum drum1 = new Drum();

        drum1.play();
        piano1.play();
        guitar1.play();
    }
}
