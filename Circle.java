package ShapesAbstract;

public class Circle implements Shape{

	int r;
	
	public void in()
	{
		r=5;
	}
	
	public void area()
	{
	System.out.println(" The area of Circle of radius " + r + " = " + 3.142f*r*r);
	}
}
