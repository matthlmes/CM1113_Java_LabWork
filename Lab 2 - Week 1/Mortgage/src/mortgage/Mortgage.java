/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mortgage;

/**
 *
 * @author matt2
 */

import java.util.Scanner;

public class Mortgage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 System.out.println("Mortgage Calculator");
 System.out.print("Please input the mortgage amount: ");
 double amount = in.nextDouble();
 System.out.print("Please input the interest rate: ");
 double rate = in.nextDouble();
 double monthlyRate = rate/12;
 System.out.print("Please input the number of years for the mortgage: ");
 int numberOfYears = in.nextInt();
 int numberOfPayments = 12 * numberOfYears;
 // Use temp variable for part of formula
 double temp = Math.pow(1+monthlyRate, numberOfPayments);
 System.out.println("" + temp + " " + numberOfYears + " " +
numberOfPayments);
 double monthlyAmount = amount * monthlyRate * temp / (temp - 1);
 System.out.printf("The monthly amount will be £%.2f \n", monthlyAmount);
        
    }
    
}
