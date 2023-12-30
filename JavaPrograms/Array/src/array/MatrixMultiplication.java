/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name: To find a matrix Multiplication
 * @author harid
 */
import java.util.Scanner;
public class MatrixMultiplication {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[][]=new int[3][3];
int arr1[][]=new int[3][3];
int mul[][]=new int[3][3];
int row=3,colum=3,i,j,k;
System.out.println("enterr the elements of first matrix");
for(i=0;i<row;i++)
{
    for(j=0;j<colum;j++)
    {
      arr[i][j]=input.nextInt();  
    }   
} 
System.out.println("enter the elements of second matrix");
for(i=0;i<row;i++)
{
    for(j=0;j<colum;j++)
    {
     arr1[i][j]=input.nextInt();
    }
}    
for(i=0;i<row;i++)
{
    for(j=0;j<colum;j++)
    {int sum=0;
        for(k=0;k<3;k++)
        {
           sum=sum+arr[i][k]*arr1[k][j]; 
        }
       mul[i][j]=sum; 
    }
}
    System.out.println("the multiplication matrix is");
for(i=0;i<row;i++)
{
    for(j=0;j<colum;j++)
    {
        System.out.println(mul[i][j]);
    }
} 
}    
}
