import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nst = 1;
        
        while(row<=2*n-1) {
        	//Print star 
        	int i = 1;
        	while(i<=nst) {
        	    System.out.print("* ");
        		i++;
        		
        	}
        	
        	//Prep for next row
        	if(row<n) {
        		nst++;
        	} else {
        		nst--;
        	}
        			
            row++;
            System.out.println();
        }
	}
}


	

