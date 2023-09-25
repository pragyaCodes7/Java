package lec4;
import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int nst = (n/2)+1;
        int nsp = -1;
        
        while(row<=n) {
        	//Print star pattern 1
        	int i = 1;
        	while(i<=nst) {
        		System.out.print("*");
        		i++;
        	}
        	//Print space
        	int j = 1;
        	while(j<=nsp) {
        		System.out.print(" ");
        		j++;
        	}
        	//Print star pattern 2
        	int k = 1;
        	if(row==1 || row==n) {
        		k = 2;
        	}
        	while(k<=nst) {
        		System.out.print("*");
        		k++;
        	}
        	//Prep for next row
        	if(row <(n/2)+1) {
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


