package lect6;
import java.util.*;
public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int base = s.nextInt();
        int x = 1;
        int ans = 0;
        
        while(n!=0) {
        	int lastDig = n%10;
        	ans = ans + lastDig*x;
        	x *= base;
        	n /= 10;
        }
        System.out.println(ans);
	}
	

}