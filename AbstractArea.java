package ShapesAbstract;

public class AbstractArea extends Abstract{
	
	void SquareArea(int s)
	{
		System.out.println("Area of Square is" +(s*s));
	}
	
	void RectangleArea(int l, int b)
	{
		System.out.println("Area of Rectangle is" +(l*b));
	}
	
	void CircleArea(int r)
	{
		System.out.println("Area of Circle is" +(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractArea a = new AbstractArea();
		a.SquareArea(5);
		a.RectangleArea(5,5);
		a.CircleArea(5);
	}
}
