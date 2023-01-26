/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asterisktriangle;

/**
 *
 * @author matt2
 */
public class AsteriskTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; ++i) {

          // inner loop to print asterisks
          for (int j = 1; j <= i; ++j) {
            System.out.print("*");
          }
          System.out.println("");
        }
        
        
        // Inverse Pyramid
        
        // outer loop
        for (int i = 1; i <= rows; ++i) {

          // inner loop to print asterisks
          for (int j = 5; j >= i; --j) {
            System.out.print("*");
          }
          System.out.println("");
        }
    }
    
}
