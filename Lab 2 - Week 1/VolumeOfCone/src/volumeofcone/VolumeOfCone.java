/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumeofcone;

/**
 *
 * @author matt2
 */

import java.util.Scanner;

public class VolumeOfCone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pi = 3.14;
        
        // User input Radius
        Scanner radius = new Scanner(System.in);
        System.out.println("What is the Radius?: ");
        double R = radius.nextDouble();
        
        // User input height
        Scanner height = new Scanner(System.in);
        System.out.println("What is the height?: ");
        double H = height.nextDouble();
        
        double V = pi * (R * R) * (H / 3);
        
        double VRounded = Math.round(V * 1000.0)/1000.0;
        
        System.out.println(VRounded);
    }
    
}
