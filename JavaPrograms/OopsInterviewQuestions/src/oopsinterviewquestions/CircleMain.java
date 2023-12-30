
package oopsinterviewquestions;
import java.util.Scanner;

public class CircleMain {
	
public static void main(String[] args) {	
	Scanner input=new Scanner(System.in);
	System.out.println("enter the area of the circle");
	double radius=input.nextDouble();
	Circle obj=new Circle(radius);
	System.out.println("area="+obj.area());
	System.out.println("Circumference="+obj.circumference());
 }
} 
