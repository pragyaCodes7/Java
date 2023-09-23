package lect2;
import java.util.*;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n>=80) {
        	System.out.println("O grade");
        } else if(n>=70 && n<80) {
        	System.out.println("A grade");
        } else if(n>=60 && n<70){
        	System.out.println("Pass");
        } else {
        	System.out.println("Fail");
        }
	}

}
