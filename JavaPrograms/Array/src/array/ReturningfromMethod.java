/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name: Returning Array from the Method 
 * @author harid
 */
public class ReturningfromMethod {
 public static int[]get()
 {
 int arr[]={1,2,3,4,5};
 return arr;
 }
    public static void main(String[] args) {
   int arr[]=get();
   for(int j:arr)
            System.out.println(j);
    }
}
