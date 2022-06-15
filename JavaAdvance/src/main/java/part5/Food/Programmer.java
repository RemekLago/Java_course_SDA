package Part5.Food;

import static Part5.Food.TypeOfFood.*;

public class Programmer implements Eating {

    private int howManyMealsEaten;
    private int weightOfMealsEaten;

    public Programmer() {
        this.howManyMealsEaten = 0;
        this.weightOfMealsEaten = 0;
    }

    @Override
    public void eat(Food food) {
        if (food.getTypeOfFood() == MIESO || food.getTypeOfFood() == OWOCE || food.getTypeOfFood() == NABIAL) {
            howManyMealsEaten += 1;
            weightOfMealsEaten += food.getWeight();
        }
    }

    @Override
    public int howManyTimes() {
        return howManyMealsEaten;
    }

    @Override
    public int howMuchGrams() {
        return weightOfMealsEaten;
    }

    @Override
    public String toString() {
        return "Programmer " + howManyMealsEaten + ", "+ weightOfMealsEaten;
    }
}
