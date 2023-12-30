/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
program name : scanning inputs from the user *
 * @author harid
 */
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
        System.out.println("to get a input from string characters");
        String b=ab.nextLine();
          System.out.println(b);
        System.out.println(" to get a input from int values");
        int a=ab.nextInt();
        System.out.println(a);
        System.out.println("to get a input from float values");
        float c=ab.nextFloat();
        System.out.println(c);
        System.out.println("to get a input like character");
        char d=ab.next().charAt(0);
        System.out.println(d);
        System.out.println("to get a input like long");
        long e=ab.nextLong();
        System.out.println(e);
        System.out.println("to get a input like double");
        double f=ab.nextDouble();
        System.out.println(f);
}
    
}
