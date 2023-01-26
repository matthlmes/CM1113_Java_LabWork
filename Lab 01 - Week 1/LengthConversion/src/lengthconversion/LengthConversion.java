/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lengthconversion;

/**
 *
 * @author matt2
 */
public class LengthConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int metres = 5;
        int inches = metres * 40;
        int feet = inches / 12;
        
        System.out.println("Metres: " + metres);
        System.out.println("Inches: " + inches);
        System.out.println("Feet: " + feet);
    }
    
}
