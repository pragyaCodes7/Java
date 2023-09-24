package lec3;
import java.util.*;

public class Pattern2 {

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
        	row++;
        	System.out.println();
        }
	}

}
