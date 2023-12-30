/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : o print a prime nnumber one to 100 
* @author harid
 */
import java.util.Scanner;
public class Primenumberonetohundred {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
for(int i=2;i<=100;i++)
{
 int b=2;   
  while(b<i)
  {
    if(i%b==0)
    {
        break;
    }
     b++;   
  }
  if(i==b)
        System.out.println(b);
}

    }
    
    
}
