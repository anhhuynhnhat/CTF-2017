/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loris
 */
public class stringProcessing {

    public static String getLast(String input) {
        if (input == null || input.length() < 3) {
            return input;
        } else {
            return input.substring(input.length() - 3);
        }
    }
}
