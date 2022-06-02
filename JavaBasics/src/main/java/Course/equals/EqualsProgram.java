package equals;

public class EqualsProgram {
    public static void main(String[] args) {

        // ==
        int liczba1 = 1;
        int liczba2 = 1;

        int liczba3 = liczba1 == 1 ? 10 : -10;
        if (liczba1 == 1) {
            liczba3 = 10;
        } else {
            liczba3 = -10;
        }

        if (liczba1 == liczba2) {
            System.out.println("Liczby są równe");
        } else {
            System.out.println("Liczby są różne");
        }

        if ((liczba1 == liczba2) == false) {
            System.out.println("Liczby są różne");
        } else {
            System.out.println("Liczby są równe");
        }

        Pies pies1 = new Pies("Owczarek", "Azor");
        Pies pies2 = new Pies("Owczarek", "Azor");

        if (pies1 == pies2) {
            System.out.println("To są te same psy");
        } else {
            System.out.println("To nie są te same psy");
        }

        if (pies1.equals(pies2)) {
            System.out.println("To są takie same psy");
        } else {
            System.out.println("To nie są takie same psy");
        }

        Pies null1 = new Pies(null, null);
        Pies null2 = new Pies(null, null);
        System.out.println(null1.equals(null2));

        Pies pies3 = pies1;
        if (pies1 == pies3) {
            System.out.println("To są te same psy");
        } else {
            System.out.println("To nie są te same psy");
        }
    }
}
