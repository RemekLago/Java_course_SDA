package Testing;

public class NameVerifier {

    public boolean isNameValid(String name) {
        return name != null
                && name.trim().length() > 0
                && !name.toUpperCase().equals(name)
                && !name.toLowerCase().equals(name);
    }
}
