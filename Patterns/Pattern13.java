import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        
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
        		nsp--;
        		nst++;
        	} else {
        		nsp++;
        		nst--;
        	}
        			
            row++;
            System.out.println();
        }
	}
}
