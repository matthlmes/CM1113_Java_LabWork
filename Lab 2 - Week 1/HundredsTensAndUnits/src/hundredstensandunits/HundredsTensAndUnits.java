/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundredstensandunits;

/**
 *
 * @author matt2
 */

import java.util.Scanner;

public class HundredsTensAndUnits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 3 digit whole number: ");
        int num = in.nextInt();
        
        int hundreds = num / 100;
        int tens = (num - hundreds * 100) / 10;
        int units = num % 10;
        
        System.out.println("Hundreds: " + hundreds + " Tens: " + tens + " Units: " + units);
    }
    
}
