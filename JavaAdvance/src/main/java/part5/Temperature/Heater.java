package Part5.Temperature;

public class Heater implements Heating{
    public double temperature;

    @Override
    public double takeTemperature() {
        return temperature;
    }

    @Override
    public void heatingTemperature() {
        temperature += 8;
    }

    public Heater(int temperature) {
        this.temperature = temperature;
    }
}
