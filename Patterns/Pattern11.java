package lec4;
import java.util.*;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nspace = n-1;
        int nst = 1;
        
        while(row<=n) {
        	//Print space
        	int i = 1;
        	while(i<=nspace) {
        		System.out.print("  ");
        		i++;
        	}
        	//Print star and space
        	int j = 1;
        	while(j<=nst) {
        		if(j%2 == 0) {
        			System.out.print("  ");
        		} else {
        			System.out.print("* ");
        		}
        		j++;
        		
        	}
        	//Prep for next row
        	nspace--;
        	nst += 2;
        			
            row++;
            System.out.println();
        }
	}

}