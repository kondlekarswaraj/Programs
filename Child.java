package ParentChild;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		s.drive();
		System.out.println(s.i);
		s.sleep();
		System.out.println(s.j);
		s.exercise();
		
		
		Father s1 = new Son();
		
		display(new Son());
		display(new Son2());
		display(new Son3());
		display(new Father());
	}
	
	static void display(Father f){
		f.drive();
	}
}

		
class Father {
		int i = 1;
		
		void drive() {
			System.out.println("Driving Swift");
	}
	    void sleep() {
	    
    }
}

		
class Son extends Father {
	     int j = 2;
			
		void drive() {
			System.out.println("Driving Kia");
	 }
		void exercise(){
			System.out.println("I'm jogging");
     }
}


class Son2 extends Father {
          int j = 2;
		
	    void drive() {
		    System.out.println("Driving Audi");
     }
	    void exercise(){
		    System.out.println("I'm jogging");
     }
}


class Son3 extends Father {
           int j = 2;
	
         void drive() {
	         System.out.println("Driving Mushtang");
     }
         void exercise(){
	         System.out.println("I'm jogging");
     }
}

