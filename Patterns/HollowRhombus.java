package lect6;
import java.util.*;
public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 1 ;
        int outer_space = n-1;
        int inner_space = n-2;
        int nst = n;
        
        while(row<=n) {
        	//Print outer space
        	int i = 1;
        	while(i<=outer_space) {
        		System.out.print(" ");
        		i++;
        	}
        	
        	//Print star
        	if(row==1 || row==n) {
        		int j = 1;
        		while(j<=nst) {
        			System.out.print("*");
        			j++;
        		}
        	} else {
        		System.out.print("*");
        		//Print inner space
        		int k = 1;
        		while(k<=inner_space) {
        			System.out.print(" ");
        			k++;
        		}
        		System.out.print("*");
        	}
        	
        	//Prep for next row
        	row++;
        	outer_space--;
        	
        	System.out.println();
        }
        
	}
}