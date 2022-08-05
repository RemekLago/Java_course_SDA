package sda.arpjava.practice;

public class Tank {
    static final double LOW_LEVEL = 0;
    double level;
    final double capacity;

    public Tank(double capacity) {
        this.capacity = capacity;
    }

    public static Tank ofOrNull(double capacity){
        return isValidCapacity(capacity) ? new Tank(capacity) : null;
    }

    private static boolean isValidCapacity(double capacity) {
        return capacity > LOW_LEVEL;
    }

    public static Tank ofOrThrowException(double capacity){
        if (!isValidCapacity(capacity)){
            throw new IllegalArgumentException("Capacity cant be negative!");
        }
        return new Tank(capacity);
    }

    public final double refill(double amount){
        if (amount < LOW_LEVEL){
            return amount;
        }
        if (level + amount > capacity){
            final double result = amount + level - capacity;
            level = capacity;
            return result;
        }
        level += amount;
        return 0;
    }

    //TODO zaimplementować zgodnie z TDD metodę odlewania ze zbiornika podanej objętości cieczy. Metoda zwraca informację o ile zmienił sie poziom w zbiorniku
    public double pourOut(double amount){
        throw new RuntimeException("Not yet implement");
    }


    public final double level(){
        return level;
    }
}
