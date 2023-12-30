/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author harid
 */
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
Scanner sw=new Scanner(System.in);
    System.out.println("enter the value from 1 to 4");
    int num=sw.nextInt();
    switch(num)
    {
        case 1:
            System.out.println("1 value");
        case 2:
            System.out.println("2 value");
    }
    
}
}
