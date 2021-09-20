package RestaurentAbstract;

public class AbstractRestaurent extends Restaurent{

	void show()
	{
		System.out.println("Open");
	}
	void display()
	{
		System.out.println("Closed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurent r = new AbstractRestaurent();
		r.show();
		r.display();
	}
}
