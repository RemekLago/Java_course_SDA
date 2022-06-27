package Part5.Temperature;

public class TemperatureMain {
    public static void main(String[] args) {
        Aircondition machine1 = new Aircondition(20);
        Fan machine2 = new Fan(15);
        Heater machine3 = new Heater(5);

        machine1.printingTemperature();
        machine1.heatingTemperature();
        machine1.printingTemperature();
        machine1.heatingTemperature();
        machine1.printingTemperature();
        machine1.coolingTemperature();
        machine1.printingTemperature();
    }
}
