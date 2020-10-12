public class Recursion {
    public static void Recursion(int n) {
    	if(n==0) {
    		System.out.println("The Recursion is finished");
    	}
    	else {
    		System.out.println("Hi");
    		n--;
    		Recursion(n);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Recursion(6);
	}

}
// prints 6 Hi and then stops 
// after it stopped it prints Recusion is finished
