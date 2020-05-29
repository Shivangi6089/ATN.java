import java.util.Scanner;
public class ATN {

	   public static void main(String[] args)
	   {
		   int num1, num2, sum;

                   System.out.println("Pass a value to stdin....");

		   Scanner sc = new Scanner(System.in);
		   System.out.println("I Enter First Number: ");
		   num1 = sc.nextInt();

		   System.out.println("I Enter second number: ");
		   num2 = sc.nextInt();

		   sc.close();
		   sum = num1 + num2;
		   System.out.println("Sum of these numbers: "+sum);


		   System.err.println("This is an error message");

	   }
}  
