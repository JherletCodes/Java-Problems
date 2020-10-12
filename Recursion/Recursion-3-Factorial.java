public class Recursion {
    public static  int Factorial(int n) {
    	if(n==1) {
    		return 0;
    	}
    	else {
    		System.out.println(n);
    		return n=n*(n-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println(Factorial(30));
    // prints the number 30
    //also prints the product of the 30!
	}

}
