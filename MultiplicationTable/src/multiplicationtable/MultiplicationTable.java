/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicationtable;

/**
 *
 * @author matt2
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 6;
        int column = 10;

        // outer loop
        for (int i = 1; i <= rows; ++i) {

          for (int j = 1; j <= column; ++j) {
                  System.out.print(i * j + " ");
              }
          System.out.println("");
        }
    }
    
}
