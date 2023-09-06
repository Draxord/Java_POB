/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Estudiantes
 */
import java.util.*;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the note: ");
        int marks = in.nextInt();
        
        if(marks<50){
          System.out.println("fail");
        }else if (marks >= 50 && marks < 60){
            System.out.println("D grade");
        }else if (marks >= 60 && marks < 70){
            System.out.println("C grade");
        }else if (marks >= 70 && marks < 80){
            System.out.println("B grade");
        }else if (marks >= 80 && marks < 90){
            System.out.println("A grade");
        }else if (marks >= 90 && marks <= 100){
            System.out.println("A+ grade");
        }else {
            System.out.println("Invalid");
        }
    }
}
