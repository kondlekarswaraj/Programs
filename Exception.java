package Case;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=50,b=0;
			int c=a/b;
			System.out.println("Division is=" +c);
			}
		
		catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		System.out.println("Continue With The Program");
    }
}
