package arrays;

public class AverageOfElementsInArray {

    public static void main(String[] args) {

        float[] table = new float[4];
        table[0] = 11.0f;
        table[1] = 31.0f;
        table[2] = 9.9f;
        table[3] = 17.17f;

        // średnia = suma / długość tablicy
        float sum = 0.0f;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }

        float avg = sum / table.length;
        System.out.println("Od lewej do prawej: " + avg);

        sum = 0.0f;
        for (int i = table.length - 1; i >= 0; i--) {
            sum += table[i];
        }

        avg = sum / table.length;
        System.out.println("Od prawej do lewej: " + avg);

        // for-each
        sum = 0.0f;
        for (float currentElement : table) {
            sum += currentElement;
        }

        System.out.println(sum);
        System.out.println("for-each: " + sum / table.length);
    }
}
