import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 1;
        int nd = n-1;
        int nst = 1;
       
        while(row<=n) {
        	 //Print dollar
        	int cd = 1;
        	while(cd<=nd) {
        		System.out.print("$ ");
        		cd++;
        	}
        	//Print star
        	int cst = 1;
        	while(cst<=nst) {
        		System.out.print("* ");
        		cst++;
        	}
        	//Prep for next row
        	nd--;
        	nst++;
        	row++;
        	System.out.println();
        	
        }
        }

}
