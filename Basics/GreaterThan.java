package lect2;
import java.util.*;

public class GreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		if(num1>num2) {
			System.out.println("num1 is max and is " + num1);
		} else {
			System.out.println("num2 is max and is " + num2);
		}
	}

}
