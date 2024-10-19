import java.util.Scanner;
public class IT24102078Lab6Q1{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number:");
		Double n1 =sc.nextDouble();
		
	 Double square = (n1*n1);
		System.out.println("The square of " + n1 + " is: " + square);
		
	 Double squareRoot = Math.sqrt(n1);
		System.out.print("The squareRoot of " + n1 + " is: " + squareRoot);	

		
	}
}


