package sda.arpjava.solid.formatter;

public class NameFormatter {

    public static String formatAsSelfName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
