/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myclass;

/**
 *
 * @author matt2
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 7;
	double a = 15.6;
	var d = 1.4;
        
	System.out.println("My sequence is ...");
        
	for (int i = 0; i < x; i++){
            double temp = a + i * d;
            System.out.println("Number " + i + " is " + temp);
        }
    }
}
