import java.util.*;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 1;
        int nspace = n-1;
        int nst = 1;
        
        while(row<=n) {
        	//Print space
        	int cspace = 1;
        	while(cspace<=nspace) {
        		System.out.print("  ");
        		cspace++;
        	}
        	//Print star
        	int cst = 1;
        	while(cst<=nst) {
        		System.out.print("1 ");
        		cst++;
        	}
            //Prep for next row
        	nspace--;
        	nst += 2;
        	
        	row++;
        	System.out.println();
        }
	}

}
