/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author bisef5371
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("List all marks:");

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length;) {
            numbers[i] = input.nextInt();
            i++;

        }

        for (int g = 0; g < 10; g++) {
            
        
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]) {
            int temporary = numbers[i];


            numbers[i] = numbers[i+1];
            numbers[i+1] = temporary;
        }
        }
        
        }
        

        System.out.println("the integers in accending order are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}