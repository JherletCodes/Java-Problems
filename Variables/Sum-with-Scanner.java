package Java;
import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Type First Number: ");
		int fnum=input.nextInt();
		System.out.print("Type Second Number: ");
		int snum=input.nextInt();
		
		int sum=fnum+snum;
		
		System.out.println("The total sum is: "+sum);
		

	}

}
