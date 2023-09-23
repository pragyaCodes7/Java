package lect2;

import java.util.Scanner;

public class SumOfSqOfNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        int sum = 0;
        
        while(i<=n) {
        	sum += (i*i);
        	i++;
        }
        
        System.out.println("Sum of square of first "+ n +" natural numbers is: "+sum);
	}
    
}
