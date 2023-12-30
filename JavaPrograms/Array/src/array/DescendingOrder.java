/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name : To print a descending order in the given array
 * @author harid
 */
import java.util.Scanner;
public class DescendingOrder {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[]=new int[5];
int size=5,i,j;
System.out.println("enter the elements in the given array");
for(i=0;i<size;i++)
{
    arr[i]=input.nextInt();
    
}    
for(i=0;i<size;i++)
{
    for(j=i+1;j<size;j++)
    {
        if(arr[i]<arr[j])
        {
            int num=arr[i];
            arr[i]=arr[j];
            arr[j]=num;
        }
    }
}
    System.out.println("the descending order is");
    for(i=0;i<size;i++)
    {
        System.out.println(arr[i]);
    }    

    
    
    }
    
}
