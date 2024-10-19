import java.util.Scanner;
public class IT24102078Lab6Q2C{
	public static void main(String[]args){
		
	System.out.println("Enter the 10 numbers:");
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number 1:");
	   Double n1 =sc.nextDouble();
	   
	   System.out.print("Enter number 2:");
	   Double n2 =sc.nextDouble();
	   
	   System.out.print("Enter number 3:");
	   Double n3 =sc.nextDouble();
	   
	   System.out.print("Enter number 4:");
	  Double n4 =sc.nextDouble();
	   
	   System.out.print("Enter number 5:");
	   Double n5 =sc.nextDouble();
	   
	   System.out.print("Enter number 6:");
	   Double n6 =sc.nextDouble();
	   
	   System.out.print("Enter number 7:");
	   Double n7 =sc.nextDouble();
	   
	   System.out.print("Enter number 8:");
	   Double n8 =sc.nextDouble();
	   
	   System.out.print("Enter number 9:");
	  Double n9 =sc.nextDouble();
	   
	   System.out.print("Enter number 10:");
	  Double n10 =sc.nextDouble();
		
		System.out.println("The numbers you entered are: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 + ", " + n7 + ", " + n8 + ", " + n9 + ", " + n10);
    double sum = 0;
  sum = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
  System.out.println("Sum of the numbers:"+sum);
  
 double avg = 0;
  avg = sum/10.0;
  System.out.println("Avarage of the numbers:"+avg);
  
	 
		
	}
}