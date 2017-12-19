
public class stringProcessing {

    public static String getLast(String input) {
        if (input == null || input.length() < 3) {
            return input;
        } else {
            return input.substring(input.length() - 3);
        }
    }
}
