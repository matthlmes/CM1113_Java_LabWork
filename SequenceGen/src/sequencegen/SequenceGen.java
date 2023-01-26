/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequencegen;

/**
 *
 * @author matt2
 */

import java.util.*;

public class SequenceGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int StartPoint = 0;
        int NumberOfTerms = 7;
        int AmountAdded = 5;
        
        for(int i=0; i <= NumberOfTerms-1; i++){
            System.out.println(StartPoint);
            StartPoint = StartPoint + AmountAdded;
        }
        
    }
    
}
