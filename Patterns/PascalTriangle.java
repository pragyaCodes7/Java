import java.util.*;

public class PascalTriangle  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 0;
        int rowval = 1;
        
        while(row<n) {
        	//Print star
        	int i = 0;
        	int ncr = rowval;
        	while(i<=row) {
        		System.out.print(ncr + " ");
        		ncr = (ncr * (row-i))/(i+1);
        		i++;
        	}
        	
        	//Prep for next row
        	row++;
        	System.out.println();
        }
	}

}
