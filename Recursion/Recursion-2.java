public class Recursion {
    public static void CountBackwards(int n) {
    	if(n==0) {
    		System.out.println("The Recursion is finished");
    	}
    	else {
    		System.out.println(n);
    		n--;
    		CountBackwards(n);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountBackwards(6);
	}

}
// counts the numbers backwards
// from 6 into 1
//then it prints The Recursion is finished
