import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nst = n;
        int nsp = 0;
        
        while(row<=2*n-1) {
        	//Print space
        	int j = 1;
        	while(j<=nsp) {
        		System.out.print("  ");
        		j++;
        	}
        	//Print star 
        	int i = 1;
        	while(i<=nst) {
        	    System.out.print("* ");
        		i++;
        		
        	}
        	
        	//Prep for next row
        	if(row<n) {
        		nst--;
        		nsp+=2;
        	} else {
        		nst++;
        		nsp-=2;
        	}
        			
            row++;
            System.out.println();
        }
	}
}
