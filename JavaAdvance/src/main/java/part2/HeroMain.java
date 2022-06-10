package part2;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Aquaman", "BBB");
        Hero hero2= new Hero("Spiderman", "AAA");
        Hero hero3 = new Hero("Heman", "CCC");


        hero1 = hero2;
        hero1 = null;
        System.out.println("1. " + hero1==null);

        hero1 = null;
        hero2 = hero1;
        hero1=hero3;
        System.out.println("2. " + hero1==null);
        System.out.println("3. " + hero2==null);
        System.out.println("4. " + hero3==null);

        String string1 = "Home";
        String string2 = "Home";
        String string3 = "home";
        System.out.println("Strings: " + (string1.equals(string2)));
        System.out.println("Strings: " + (string1 == string2));
        System.out.println("Strings: " + (string1.equals(string3)));
        System.out.println("Strings: " + (string1 == string3));
    }
}
