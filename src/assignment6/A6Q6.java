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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many studetns are in the class");
        int a = input.nextInt();
        System.out.println("please enter in " + a + " marks");
        //entering in the marks to be odered
        double[] marks = new double[a];
        for (int i = 0; i < a; i++) {
            marks[i] = input.nextInt();
        }
        for (int p = 0; p < a - 1; p++) {

            for (int i = 0; i < a - 1; i++) {
                //i is x
                //i + 1 is y
                if (marks[i] > marks[i + 1]) {
                    double nm = marks[i + 1];
                    double nm2 = marks[i];
                    marks[i] = nm;
                    marks[i + 1] = nm2;
                }
            }
        }
        double sum = 0;
        for (int i = 0; i < a; i++) {
            
            //add number that it is on to the current sum
            sum = sum + marks[i];
        }
        //printing out gathered info
        for (int p = 0; p < a; p++) {
            System.out.print(marks[p] + ", ");
        }
        System.out.println("the lowest mark is " + marks[0]);
        System.out.println("the heighest mark is " + marks[a]);
        
        double average = sum/a;
        System.out.println("the average is" + average);
    }
    
}