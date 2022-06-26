package Part5.Temperature;

public class Fan implements Cooling{
    public double temperature;

    @Override
    public double takeTemperature() {
        return temperature;
    }

    @Override
    public void coolingTemperature() {
        temperature -= 2;
    }

    public Fan(int temperature) {
        this.temperature = temperature;
    }
}
