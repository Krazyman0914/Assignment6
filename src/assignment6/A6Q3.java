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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");

        int[] numbers = new int[2];

        for (int i = 0; i < numbers.length;) {
            numbers[i] = input.nextInt();
            i++;

        }



        if (numbers[0] > numbers[1]) {
            int temporary = numbers[0];


            numbers[0] = numbers[1];
            numbers[1] = temporary;
        }

        System.out.println("the integers in accending order are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
