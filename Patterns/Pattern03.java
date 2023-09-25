import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int row = 1;
        int col = n;
        
        while(row<=n) {
        	int i = 1;
        	while(i<=col) {
        		System.out.print("*"+ " ");
        		i++;
        	}
        	col--;
        	row++;
        	System.out.println();
        }
        
//      int row = 1;
//      
//      while(row<=n) {
//      	int i = 1;
//      	int col = n+1-row;
//      	while(i<=col) {
//      		System.out.print("* ");
//      		i++;
//      	}
//      	row++;
//      	System.out.println();
//      }
        
	}

}
