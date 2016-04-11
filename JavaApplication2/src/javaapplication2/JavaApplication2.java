/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
      int point = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your point : ");
      point = sc.nextInt();
      System.out.println("Program is calculating grade");

      switch (point / 10) {
         case 10:
         case 9:
         case 8:
            System.out.println("Your grade is A");
            break;
         case 7:
            System.out.println("Your grade is B");
            break;
         case 6:
            System.out.println("Your grade is C");
            break;
         case 5:
            System.out.println("Your grade is D");
            break;
         default:
            System.out.println("Your grade is F");
            break;
      }
   }	
}

