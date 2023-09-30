public class SwapDemo1 {

	public static void swap_(int a, int b) {
		  
		  int temp=a;
		  a=b;
		  b=temp;
		  
	   }
  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
      
	      int [] arr= {1,2,3,4,5};
	      System.out.println("Before the Swap "+ arr[0]+" "+ arr[1]);
      
	      swap_(arr[0], arr[1]);
	      System.out.println("After the Swap "+ arr[0]+" "+ arr[1]);
      
		}

}
