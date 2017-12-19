/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loris
 */
public class meo {

    public static void main(String[] args) {
        String str = "meo meo";
        String last3;
        if (str == null || str.length() < 3) {
            last3 = str;
            System.out.println(last3);
        } else {
            last3 = str.substring(str.length() - 3);
            System.out.println(last3);
        }
    }
}
