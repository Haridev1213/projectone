/*
 
 */
package controlstatement;
import java.util.Scanner;
public class IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("enter the number");
        int a=ab.nextInt();
        if(a%4==0)
        System.out.println("the given year is leap year");
        else
            System.out.println("the given year is not a leap yrar");
    }
    
}
