public class Function2 {
	
	public static int countDigit(int n) {
	
		int count = 0;
		
		while(n!=0) {

			n = n/10;
			
			count++;
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countDigit(111));

	}

}
