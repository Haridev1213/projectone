package oopsinterviewquestions;

import java.util.Scanner;

public class Rectangle {
	
 public static void main(String[] args)
 {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the legth and width");
	int len=input.nextInt();
	int wid=input.nextInt();
	RectangleFormula obj=new RectangleFormula(len,wid);
	obj.area();
	System.out.println("perimeter="+obj.perimeter());
 }
}
