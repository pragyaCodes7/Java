package lec3;
import java.util.*;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row  = 1;
        int nspace = 0;
        int nst = n;
        
        while(row<=n) {
        	//Print space
        	int cspace = 1;
        	while(cspace<=nspace) {
        		System.out.print(" ");
        		cspace++;
        	}
        	//Print star
        	int cst = 1;
        	while(cst<=nst) {
        		System.out.print("*");
        		cst++;
        	}
        	//Prep for next row
        	nspace += 2;
        	nst --;
        	row++;
        	System.out.println();
        }
	}

}
