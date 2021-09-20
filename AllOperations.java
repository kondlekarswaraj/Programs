package Operations;

public class AllOperations {

	static int a,b,c;
	static double d,e,f;
	
	static int i,j,k;
	static double l,m,n;
	
	static int p,q,r;
    static double x,y,z;
	
	
	   public static void sub(int a,int b)
	   {
		   c=a-b;
		   System.out.println("Substraction is"+c);
	   }
	   
	   public static void sub(double d,double e)
	   {
		   f=d-e;
		   System.out.println("Substraction is"+f);
	   }
	   
	   public static void mul(int i,int j)
	   {
		   k=i*j;
		   System.out.println("Multiplication is"+k);
	   }

	   public static void mul(double l,double m)
	   {
		   n=l*m;
		   System.out.println("Multiplication is"+n);
	   }
	   
	   public static void div(int p,int q)
	   {
		   r=p/q;
		   System.out.println("Division is"+r);
	   }
	   
	   public static void div(double x,double y)
	   {
		   z=x/y;
		   System.out.println("Division is"+z);
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sub(100,80);
    	sub(25.9,7.6);
    	mul(40,5);
    	mul(64.8,55.1);
    	div(65,5);
    	div(31.3,4.5);
	}

}
