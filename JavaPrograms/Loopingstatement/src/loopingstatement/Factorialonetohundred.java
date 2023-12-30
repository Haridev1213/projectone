/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : factorial one to 100
 * @author harid
 */
import java.util.Scanner;
public class Factorialonetohundred {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int fact=1;
for(int i=1;i<=10;i++)
{
  fact=fact*i;
System.out.println(fact);        
} 
}
}