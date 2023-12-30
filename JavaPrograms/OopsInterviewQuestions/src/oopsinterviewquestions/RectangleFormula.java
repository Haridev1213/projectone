package oopsinterviewquestions;

public class RectangleFormula {
	private int length;
	private int width;
	
 public RectangleFormula(int length,int width){
	 this.length=length;
	 this.width=width;  
  }
 
 public void area() {
	 int ar=length*width;
	 System.out.println("Area="+ar);
 }
 
 public int perimeter() {
	 int peri=2*(length+width);
	 return peri;
 }
}