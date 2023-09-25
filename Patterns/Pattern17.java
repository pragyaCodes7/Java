package lec4;
import java.util.*;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nsp = (n+1)/2;
        int nst = 1;
        
        while(row<=n) {
        	//Print space
        	int i = 1;
        	while(i<=nsp) {
        		System.out.print("  ");
        		i++;
        	}
        	//Print star
        	int j = 1;
        	while(j<=nst) {
        		System.out.print("* ");
        		j++;
        	}
        	//Prep for next row
        	if(row<(n+1)/2) {
        		nsp--;
        		nst+=2;
        	} else {
        		nsp++;
        		nst-=2;
        	}
        	row++;
        	System.out.println();
        }
	}

}
