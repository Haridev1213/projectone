/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name: To delete a number in the given array
 * @author harid
 */
import java.util.Scanner;
public class ArrayDeletion {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[]=new int[6];
int size=5,i;
System.out.println("enter the elements of the array");       
for(i=0;i<size;i++)
{
    arr[i]=input.nextInt();
    
}
    System.out.println("enter the position");
    int position=input.nextInt();
    for(i=position;i<size;i++)
    {
        arr[i]=arr[i+1];
    }    
    System.out.println("after deletion");
    for(i=0;i<size;i++)
    {
        System.out.println(arr[i]);   
    }
    }
   
    
}
