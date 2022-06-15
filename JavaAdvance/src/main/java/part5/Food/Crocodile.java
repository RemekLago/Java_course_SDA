package Part5.Food;

import Part5.Food.Eating;
import Part5.Food.Food;

import static Part5.Food.TypeOfFood.MIESO;

public class Crocodile implements Eating {

    private int howManyMealsEaten;
    private int weightOfMealsEaten;

    public Crocodile() {
        this.howManyMealsEaten = 0;
        this.weightOfMealsEaten = 0;
    }

    @Override
    public void eat(Food food) {
        if (food.getTypeOfFood() == MIESO) {
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
        return "Crocodile " + howManyMealsEaten + ", "+ weightOfMealsEaten;
    }
}
