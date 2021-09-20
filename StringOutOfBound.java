package Case;

public class StringOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str="Main Iss Bache Huye Khane Ka Kya Karu?";
			str.charAt(30);
			}
		
		catch(StringIndexOutOfBoundsException e) 
			{
			System.out.println("String is:");
			}
	}
}
