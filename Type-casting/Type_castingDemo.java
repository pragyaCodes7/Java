public class Type_castingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 134;
		
		double d = a; // Implicit type casting
		
		System.out.println(d);
		
		//byte b = a; THIS THROWS ERROR 'COS DATA LOSS MIGHT BE POSSIBLE;
		
		byte b = (byte)a;
		
		System.out.println(b);

	}

}
