package ShapesAbstract;

public class Square implements Shape {

	int s;

	public void in()
	{
		s=5;
	}
	
	public void area()
	{
	System.out.println(" The area of Square of side " + s + " = " + s*s);
	}
}
