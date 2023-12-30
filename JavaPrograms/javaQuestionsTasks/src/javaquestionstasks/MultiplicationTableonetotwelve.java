/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestionstasks;

/**
 *program name: print a multiplication table of 1 to 12
 * @author harid
 */
import java.util.Scanner;
public class MultiplicationTableonetotwelve {
public static void main(String[] args) {
int multi;    
for(int i=1;i<=10;i++)
{
    System.out.print("\t\n");
    for(int j=1;j<=12;j++)
    {
        multi=i*j;
        System.out.print("\t");
        System.out.print(multi);
        System.out.print("\t");
    }
    
}
    }
    
}
