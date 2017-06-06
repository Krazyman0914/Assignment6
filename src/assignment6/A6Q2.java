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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people are there?");

        double sum = 0;
        int people = input.nextInt();

        double[] heights = new double[people];

        System.out.println("Enter the heights: ");
        for (int i = 0; i < people; i++) {
            heights[i] = input.nextInt();
        }
        for (int i = 0; i < people; i++) {
            sum = heights[i] + sum;
        }
        double average = sum / people;

        for (int i = 0; i < people; i++) {
            if (heights[i] > average) {
                System.out.println(heights[i] + " is above average");
            }
        }
    }
}
