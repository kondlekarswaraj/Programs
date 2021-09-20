package ShapesAbstract;

public class Rectangle implements Shape {

	int l;
	int b;

	public void in()
	{
		l=5;
		b=5;
	}
	
	public void area()
	{
	System.out.println(" The area of Rectangle of length " + l + " and breadth " + b + " = " + l*b);
	}
}
