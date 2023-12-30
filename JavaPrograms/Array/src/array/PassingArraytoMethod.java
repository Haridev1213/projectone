/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name :Passing array to the method
 * @author harid
 */
public class PassingArraytoMethod {
public static void min(int arr[]) 
{
int max=arr[0];
for(int i=1;i<arr.length;i++)

  if(max<arr[i])
      max=arr[i];
    System.out.println(max);
       
}
public static void main(String[] args) {
    int a[]={9,5,3};
  min(a);  
}
}
