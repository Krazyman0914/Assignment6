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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREATING A SCANNER FOR USER INPUT
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many students are in the class?");
        
        int answer = input.nextInt();
        
        double[] marks = new double[answer];
        
        System.out.println("Enter the marks: ");
        for (int i = 0; i < answer; i++) {
            marks[i] = input.nextInt();
        }
        
        double sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
        }
        double avg = sum/marks.length;
        System.out.println("the average is " + avg);
        }
        
    }

