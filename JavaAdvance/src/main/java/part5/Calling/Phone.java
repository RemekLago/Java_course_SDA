package Part5.Calling;

import java.util.Random;

public class Phone implements Calling {
    private String phoneNumber;
    private int summaryCallTime;


    @Override
    public void callingAnyNumber() {

        if (isCallingDone()) {
            summaryCallTime += randomTimeCalling();
            int lastCallingTime = randomTimeCalling();
            System.out.println("Time of last calling: " + lastCallingTime);
        } else {
            System.out.println("Sorry the number is unavailable");
        }
    }

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.summaryCallTime = 0;
    }

    @Override
    public void callingAlarmNumber() {
    }

    public int randomTimeCalling() {
        int min = 1;
        int max = 60;
        //Generate random int value from 1 to 60
        int randomCallTime = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomCallTime;
    }

    public boolean isCallingDone() {
        Random randomResult = new Random();
        boolean isCallingDone = randomResult.nextBoolean();
        return isCallingDone;
    }
}
