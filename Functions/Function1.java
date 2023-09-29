public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main starts");
		
		addTwoNumbers();
		
//		Sub();
		
		System.out.println("Main ends");

	}
	

public static void addTwoNumbers() {
		
		System.out.println("addTwoNumbers function starts");
		
		int a = 12;
		int b = 13;
		
		int c=a+b;
		
		System.out.println(c);
		
		Sub();
		
		System.out.println("addTwoNumbers function ends");
	}

public static void Sub() {
	
	System.out.println("Sub function starts");
	
	int a = 12;
	int b = 13;
	
	int c= a-b;
	
	System.out.println(c);
	
	System.out.println("Sub function ends");
}

}
