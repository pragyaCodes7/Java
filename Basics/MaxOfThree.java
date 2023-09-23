package lect2;
import java.util.*;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>=c && a>=b) {
			System.out.println("a is max and is equal to "+a);
		} else if(b>=a && b>=c) {
			System.out.println("b is max and is equal to "+b);
		} else {
			System.out.println("c is max and is equal to "+c);
		}
           
	}

}
