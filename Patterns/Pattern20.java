package lec4;
import java.util.*;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 1;
        int nspace = n-1;
        int nst = 1;
        int rowVal = 1;
        
        while(row<=n) {
        	//Print space
        	int cspace = 1;
        	while(cspace<=nspace) {
        		System.out.print("  ");
        		cspace++;
        	}
        	//Print star
        	int cst = 1;
        	int colVal = rowVal;
        	while(cst<=nst) {
        		System.out.print(colVal+" ");
        		cst++;
        	}
            //Prep for next row
        	nspace--;
        	nst += 2;
        	rowVal++;
        	row++;
        	System.out.println();
        }
	}

}