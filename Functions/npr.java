public class npr {

	public static int fact(int n) {
		
		int ans=1;
		
		for(int i=1; i<=n;i++) {
			ans*=i;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=12;
      int r=4;
      
      int nfact=fact(n);
      
      int n_minus_rfact=fact(n-r);
      
      int npr= nfact/n_minus_rfact;
      
      System.out.println(npr);
      
	}

}
