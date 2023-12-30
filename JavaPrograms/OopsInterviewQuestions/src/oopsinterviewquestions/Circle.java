package oopsinterviewquestions;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double area()
	{
	    double	ar=3.14*radius*radius;
		return ar;
	}
	
	public double circumference()
	{
		double circum=2*3.14*radius;
		return circum;
	}

}
