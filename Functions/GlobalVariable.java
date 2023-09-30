public class GlobalVariable {
	
	static int b=10;           // Global variable
	
	public static void fun1() {
		
		int b=20;               // Local variable
		
		System.out.println("fun1 is start");
		System.out.println(b);
		b++;
		System.out.println("fun1 is End");
		
	}
	public static void fun2() {
		
		System.out.println("fun2 is start");
		System.out.println(b);
		System.out.println("fun2 is End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		fun1();
		fun2();
	}

}
