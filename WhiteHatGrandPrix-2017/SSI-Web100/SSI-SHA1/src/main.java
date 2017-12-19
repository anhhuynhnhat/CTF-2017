
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loris
 */
public class main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println("Enter string:");
//        String rawString = userInput.readLine();
//
//        
//        try {
//            System.out.println("SHA1 hash of string: " + AeSimpleSHA1.SHA1(rawString));
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 5000; i++) {
            String rsHash = AeSimpleSHA1.SHA1(String.valueOf(i)).toString();
            if (stringProcessing.getLast(rsHash).toString().equalsIgnoreCase("ab1")) {
                System.out.println("FOUND: " + i);
            }
        }
    }
}
