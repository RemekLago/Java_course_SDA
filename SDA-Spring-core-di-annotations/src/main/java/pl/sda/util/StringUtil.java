package pl.sda.util;

public class StringUtil {

    public Integer parseString(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
