package lec9;
import java.util.*;
public class Function3 {
	
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
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int dig = countDigit(n);
		
		System.out.println(dig);
		
		System.out.println(CheckArmstrong(n,dig));
		
		

	}
	
	public static boolean CheckArmstrong(int n, int dig) {
			
			int sum = 0;
			
			int dummy = n;
			
			while(n!=0) {
				int lastDig = n%10;
				
				sum += Math.pow(lastDig,dig);
				
				n /= 10;
			}
		
            System.out.println(sum);
			
			if(sum == dummy) {
				return true;
			} else {
				return false;
			}

	}
	
	

}
