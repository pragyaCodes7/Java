public class Applications_of_TypeCasting {

	public static void main(String[] args) {
		
		int a = 23;
		byte b = 45;
		int c = a + b;
		// Implicit type casting of b to INT data type;
		System.out.println(c);
		
		double d = 20;
		int ans = (int)(c+d);
		// Explicit type casting of c+d(double) to INT;
		System.out.println(ans);
		
		int v = 100_000; // differentiates zeros
		System.out.println(v);
		
		int bin = 0b110; // represents binary
		System.out.println(bin);
		
		char ch = 'a';
		
		// ch = (char)(ch+1);
		
		ch++;  // Java does the explicit type casting internally for us so no error thrown
		
		System.out.println(ch);
		
		byte j = 12;
		
		j = (byte)(j+1);

	}

}
