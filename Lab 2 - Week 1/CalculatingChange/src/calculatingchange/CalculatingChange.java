/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatingchange;

/**
 *
 * @author matt2
 */

import java.util.Scanner;

public class CalculatingChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input change in £: ");
        double amountPounds = in.nextDouble();
        
        int amountPence = (int) (amountPounds * 100);
        
        int poundCoins = amountPence / 100;
        amountPence -= poundCoins * 100;
        
        int fifties = amountPence / 50;
        amountPence -= fifties * 50;
        
        int twenties = amountPence / 20;
        amountPence -= twenties * 20;
        
        int tens = amountPence / 10;
        amountPence -= tens * 10;
        
        int fives = amountPence / 5;
        amountPence -= fives * 5;
        
        int two = amountPence / 2;
        amountPence -= two * 2;
        
        int pennies = amountPence;
        
        System.out.printf("Change is %d £1s, %d 50s, %d 20s, %d 10s, %d 5s, %d 2s,%d 1s, \n", poundCoins, fifties, twenties, tens, fives, two, pennies); 
    }
    
}
