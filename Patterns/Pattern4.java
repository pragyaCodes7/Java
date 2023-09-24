import java.util.*;
public class Pattern4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int row = 1;
        int col = 1; // nst
        int num = 1;
        
        while(row<=n) {
        	int count = 1;
        	while(count<=col) {
        		System.out.print(num+ "\t");
        		count++;
        		num++;
        	}
        	col++;
        	row++;
        	System.out.println();
        }
	}
}
