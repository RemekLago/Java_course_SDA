package strings;

public class StringProgram {
    public static void main(String[] args) {

        int a;
        boolean b;
        long l;

        String text = "Ala ma kota";
        String text2 = "Ala ma kota";
        System.out.println(text == text2);

        System.out.println(text);
        text = text + ", kot ma Alę";
        System.out.println(text);

        String text3 = "Ala ma kota, kot ma Alę";
        System.out.println(text == text3); // why false?
        System.out.println(text.equals(text3));

        System.out.println("To jest suma 4 + 4: " + (4 + 4));
        System.out.println(4 + 4 + " to jest suma 4 + 4");
        System.out.println("To jest pies azor " + new Pies(null, "Azor"));
        String aaa = "a " + new Pies(null, null);

        // length
        System.out.println();
        System.out.println(text + " ma " + text.length() + " znaków");

        String ala = "Ala ma kota";
        String kot = ", kot ma Alę";

        // aletrnatywa dla znaku +
        String alakot = ala.concat(kot);
        System.out.println(alakot);
        ala = ala.concat(kot);

        String jola = ala.concat(ala).replace("Ala", "Jola");
        System.out.println(jola);
        System.out.println(jola.toLowerCase());
        System.out.println(jola.toUpperCase());

        String spaces = "     a     ";
        System.out.println(spaces.trim().length());

        String[] jolaTable = jola.split(" ");
        for (int i = 0; i < jolaTable.length; i++) {
            System.out.println(i + ": " + jolaTable[i]);
        }

        String[] split2 = jola.split("");

        System.out.println(jola.charAt(0));
        for (int i = 0; i < jola.length(); i++) {
            System.out.println(i + ": " + jola.charAt(i));
        }

        System.out.println(jola.substring(42, 44));
        System.out.println(jola.substring(42));

        System.out.println(jola.contains("kot"));
        System.out.println(jola.contains("pies"));
        System.out.println(jola.endsWith("Jolę"));
        System.out.println(jola.endsWith("Alę"));
        System.out.println(jola.startsWith("Ala"));
        System.out.println(jola.startsWith("Jola"));

        System.out.println(jola.indexOf(281));
        System.out.println(jola.indexOf(282));

        System.out.println(jola.compareTo(jola));
        System.out.println("    ".isBlank());
        System.out.println("    ".isEmpty());
        System.out.println("".isEmpty());

        int i = 100;
        String si = "" + i;
        String si2 = String.valueOf(i);
    }
}
