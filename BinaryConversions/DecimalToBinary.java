package lect6;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int ans = 0;
        int placeValue = 1;
        
        while(n!=0) {
        	int rem = n % 2;
        	ans += rem*placeValue;
        	
        	placeValue *= 10;
        	n /= 2;
        }
        System.out.println(ans);
	}

}
