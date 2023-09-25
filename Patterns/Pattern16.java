import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nst1 = (n-1)/2;
        int nsp = 1;
        int nst2 = (n-1)/2;
        
        while(row<=n) {
        	//Print star pattern 1
        	int i = 1;
        	while(i<=nst1) {
        		System.out.print("* ");
        		i++;
        	}
        	//Print space
        	int j = 1;
        	while(j<=nsp) {
        		System.out.print("  ");
        		j++;
        	}
        	//Print star pattern 2
        	int k = nst2;
        	while(k>=1) {
        		System.out.print("* ");
        		k--;
        	}
        	//Prep for next row
        	if(row < (n+1)/2) {
        		nst1--;
        		nsp+=2;
        		nst2--;
        	} else {
        		nst1++;
        		nsp-=2;
        		nst2++;
        	}
        	row++;
        	System.out.println();
        	
        }
	}

}
