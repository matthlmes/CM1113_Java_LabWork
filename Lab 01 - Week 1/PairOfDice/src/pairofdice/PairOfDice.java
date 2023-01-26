/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pairofdice;

/**
 *
 * @author matt2
 */
public class PairOfDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Math.random() gives either 0 or 1, to get 1 to 6 you multiply by 6 and add 1
        int d1 = (int) (Math.random()*6) + 1;
        int d2 = (int) (Math.random()*6) + 1;
        
        
        System.out.println("Dice 1: " + d1);
        System.out.println("Dice 2: " + d2);
    }
    
}
