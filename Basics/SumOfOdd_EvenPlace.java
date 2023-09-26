import java.util.*;
public class SumOfOdd_EvenPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        int count = 0;
        
        while(n>0) {
        	int dig = n%10;
        	count++;
        	if(count%2 == 0) {
        		sumEven += dig;
        	} else {
        		sumOdd += dig;
        	}
        	n /= 10;
        }
        
        System.out.println(sumEven);
        System.out.println(sumOdd);
        
	}

}
