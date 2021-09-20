package Case;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {10,20,30,40,50};
			}
			
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		    }
    	System.out.println("Exception Caught");
	}
}
