
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        for (int i = 0; i < 5000; i++) {
            String rsHash = simpleSHA1.SHA1(String.valueOf(i)).toString();
            if (stringProcessing.getLast(rsHash).toString().equalsIgnoreCase("ab1")) {
                System.out.println("FOUND: " + i);
            }
        }
    }
}
