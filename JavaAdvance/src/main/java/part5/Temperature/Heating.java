package Part5.Temperature;

public interface Heating {
    double takeTemperature();

    void heatingTemperature();

    default void printingTemperature() {
        System.out.println("Actual temperature is: " + takeTemperature());
    }

}
