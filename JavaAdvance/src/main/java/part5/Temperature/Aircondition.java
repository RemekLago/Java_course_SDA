package Part5.Temperature;

public class Aircondition implements Cooling, Heating{
    public double temperature;

    @Override
    public void printingTemperature() {
        System.out.println("Actual temperature is: " + takeTemperature());
    }

    @Override
    public double takeTemperature() {
        return temperature;
    }

    @Override
    public void heatingTemperature() {
        temperature += 10;
    }

    @Override
    public void coolingTemperature() {
        temperature -= 5;
    }

    public Aircondition(int temperature) {
        this.temperature = temperature;
    }
}
