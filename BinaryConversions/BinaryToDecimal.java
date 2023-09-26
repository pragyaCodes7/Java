import java.util.*;
public class BinaryToDecimal {
	//Simple Binary to Decimal

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int x = 1;
        int binary = 0;
        
        while(n!=0) {
        	int lastDig = n %10;
        	binary += lastDig*x;
        	
        	x *= 2;
        	n /= 10;
        	
            
        }
        System.out.print(binary);
	}

}
