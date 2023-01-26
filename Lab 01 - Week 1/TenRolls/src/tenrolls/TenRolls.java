/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tenrolls;

/**
 *
 * @author matt2
 */
public class TenRolls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; ++i){
            int d1 = (int) (Math.random()*6) + 1;
            int d2 = (int) (Math.random()*6) + 1;

            System.out.println("Roll " + i);
            System.out.println("Dice 1: " + d1);
            System.out.println("Dice 2: " + d2);
        }
        
    }
    
}
