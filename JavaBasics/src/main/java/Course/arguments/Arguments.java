package arguments;

public class Arguments {
    // {akcesor} {typ zmiennej} {nazwa zmiennej}
    private int name;

    public static void main(String[] args) {
        int a = 1 + 1; // 2
        int b = 1 - 1; // 0
        int c = 1 * 1; // 1
        int d = 1 / 1; // 1
        int e = 10 % 3; // 1

        int oldValue = 1345; // (double)oldValue == 1345.0
        int valueFromDatabase = 11; // (double)valueFromDatabase == 11.0

        double result1 = oldValue / valueFromDatabase;
        System.out.println(result1);

        // rzutowanie - zmiana typu wartości zmiennej
        double result2 = (double)oldValue / (double)valueFromDatabase;
        System.out.println(result2);

    }

    void method() {
        // deklaracja + inicjalizacja
        int local = 1;

        // deklaracja
        int local1;

        // inicjalizacja
        local1 = 1;

        int a = local + name + local1;

        // zasady pozwalają na użycie poniższych nazw
        int $;
        int $abc;
        int abc$;
        int a1;
        int a_1;
        int a$1;
        int _abc;

        // konwencja jest natomiast taka:
        int abc;
        int abc1;
        int abc2;
        // itd

        // zmienna, która reprezentuje saldo konta
        int s; // nazwa niejednoznacznie opisuje co przechowuje
        // bank account balance
        int bankAccountBalance;

        // modyfikacja salda konta
        int bankAccountBalance1 = 100;
        int bankAccountBalance2 = bankAccountBalance1 + 100;

        int bankAccountBalanceOld = 100;
        final int bankAccountBalanceNew = bankAccountBalanceOld + 100;
        // zmienna final nie może być modyfikowana
        // bankAccountBalanceNew = bankAccountBalanceNew + 100;
    }

    void booleanVariables() {
        boolean variableTrue = true;
        boolean variableFalse = false;

        boolean negationTrue = !variableTrue; // false
        boolean trueOrFalse = variableTrue || variableFalse; // true lub false = true
        boolean falseOrTrue = variableFalse || variableTrue; // false lub true = true
        boolean falseOrFalse = variableFalse || variableFalse; // false lub false = false
        boolean trueOrTrue = variableTrue || variableTrue; // true lub true = true

        boolean trueAndFalse = variableTrue && variableFalse; // true i false = false
        boolean falseAndTrue = variableFalse && variableTrue; // false i true = false
        boolean falseAndFalse = variableFalse && variableFalse; // false i false = false
        boolean trueAndTrue = variableTrue && variableTrue; // true i true = true
    }

    void charVariables() {
        char charA = 'A';
        System.out.println(charA); // 'A'

        charA = 232;
        System.out.println(charA); // e z kreseczką

        charA = 260;
        System.out.println(charA); // Ą
    }

    void numberVariables() {
        byte variableByte = 1; // -128 do 127
        variableByte = (byte)130;

        System.out.println(variableByte);
        // 128 = -128
        // 129 = -127
        // 130 = -126

        short variableShort = (byte)32770;
        // 32768 = -32768
        // 32769 = -32767
        // 32770 = -32766

        variableShort = variableByte;
        // nie możemy przypisać wartości typu short to zmiennej typu byte
        // variableByte = variableShort;

        int variableInt = 1;
        // nie możemy przypisać wartości typu int to zmiennej typu short
        // variableShort = variableInt;

        long variableLong = 1;
        // variableInt = variableLong;

        float variableFloat = 1.1f;
        double variableDouble = 1.1;

        double intPlusDouble = variableInt + variableDouble;


    }
}
