package Case;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s1=null;
			System.out.println(s1.length());
		    }
			
		catch(NullPointerException e)
			{
				System.out.println("String is Empty");
			}
	}
}                           
