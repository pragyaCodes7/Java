package lec4;
import java.util.*;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s  = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 1;
        int nst = n;
        int nsp = n-2;
        
        while(row<=n) {
        	if(row==1 || row==n) {
        		int count = 1;
        		while(count<= nst) {
        			System.out.print("* ");
        			count++;
        		}
        	} else {
        		System.out.print("* ");
        		
        		// Print space
        		int space = 1;
        		while(space<=nsp) {
        			System.out.print("  ");
        			space++;
        		}
        		System.out.print("* ");
        	}
        	row++;
        	System.out.println();
        }
        }

}
