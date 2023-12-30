/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name : Two dimensional array addition
 * @author harid
 */
import java.util.Scanner;
public class TwodimensionalarrayAddition {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[][]=new int[5][5];
int arr1[][]=new int[5][5];
int sum[][]=new int[2][2];
int row=2,colu=2,i,j;
    System.out.println("enter the elements of the first matrix");
for(i=0;i<row;i++)
{
   for(j=0;j<colu;j++)
   {
       arr[i][j]=input.nextInt();
   }
}
    System.out.println("enter the elements of the second matrix");
for(i=0;i<row;i++)
{
    for(j=0;j<colu;j++)
    {
        arr1[i][j]=input.nextInt();
    }
    
}

for(i=0;i<row;i++)
{
    for(j=0;j<colu;j++)
    {
//int sum[][] = null;        
        sum[i][j]=arr[i][j]+arr1[i][j];
    }
}
    System.out.println("the sum is");
for(i=0;i<row;i++)
{
    for(j=0;j<colu;j++)
    {
//int sum[][]=null;        
        System.out.println(sum[i][j]);    
    }
}}}
