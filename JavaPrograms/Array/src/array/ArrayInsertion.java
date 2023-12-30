
package array;

/**
 *program name: To insert a new element in the given array
 * @author harid
 */
import java.util.Scanner;
public class ArrayInsertion {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[]=new int[6];
int size=5,i;
System.out.println("enter the elements of the array");
for(i=0;i<size;i++)
{
  arr[i]=input.nextInt();  
} 
    System.out.println("enter the position ");
    int position=input.nextInt();
    System.out.println("enter the elemnt");
    int num=input.nextInt();
for(i=size-1;i>=position-1;i--)
{
arr[i+1]=arr[i];
}
arr[position]=num;
    System.out.println("after inserting");
for(int j:arr)    
{
    System.out.println(j);  
}    
    
}   
}
