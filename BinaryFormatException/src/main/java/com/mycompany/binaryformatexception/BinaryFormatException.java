/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binaryformatexception;

/**
 *
 * @author jswain
 */
public class BinaryFormatException {

    public static void main(String[] args) {

        System.out.println(bin2Dec("1100100"));
        // insert derp
        System.out.println(bin2Dec("unclefunkle"));
    }//data for test

    public static int bin2Dec(String binary) throws BFormatException {

        if (!isBinary(binary)) {
            throw new BFormatException(binary + " is not a binary number.");
        }
        int power = 0;
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {

            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static boolean isBinary(String binary) {

        for (char ch : binary.toCharArray()) {
            if (ch != '1' && ch != '0') return false;
        }//check for binary
        return true;
    }//end isBinary

}

class BFormatException extends IllegalArgumentException {

    BFormatException(String s) {
        super(s);
    }
    
}//end program

