/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name: To print a maximum and minimum number of the given array
 * @author harid
 */
import java.util.Scanner;
public class MaximumMinimumnumber {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[]=new int[5];
int size=5,i;
    System.out.println("enter the elements of the array");
for(i=0;i<size;i++)
{
  arr[i]=input.nextInt();  
}
int min=arr[0];
for(i=0;i<size;i++)
{
    if(arr[i]<min)
    {
        min=arr[i];
        System.out.println("the minimum number is"+min);
    }
}
    
    }
    
}
