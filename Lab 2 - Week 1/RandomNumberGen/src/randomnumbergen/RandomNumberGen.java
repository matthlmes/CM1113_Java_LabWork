/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumbergen;

/**
 *
 * @author matt2
 */

import java.util.Scanner;

public class RandomNumberGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // (a) Between 0 and 1
        //double randomValue = Math.random();

        // (b) Between 0 and q
        //System.out.print("Please input the upper limit for the random number: ");
        //int q = in.nextInt();
        //double randomValue = Math.random()*q;
        //System.out.println(randomValue);

        // (c) Between 0 and q (integer)
        //System.out.print("Please input the upper limit for the random number: ");
        //int q = in.nextInt();
        //int randomValue = (int)(Math.random() * (q + 1));
        //System.out.println(randomValue);

        // (d) Between p and q (integer)
        System.out.print("Please input the lower limit for the random number: ");
        int p = in.nextInt();
        System.out.print("Please input the upper limit for the random number: ");
        int q = in.nextInt();
        int randomValue = ((int)(Math.random() * (q - p + 1))) + p;
        System.out.println(randomValue); 

    }
    
}
