package Part5.Temperature;

public interface Cooling {

    double takeTemperature();
    void coolingTemperature();

    default void printingTemperature() {
        System.out.println("Actual temperature is: " + takeTemperature());
    }
}
