import java.util.Scanner;
public class SumCalculator{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.printf("The sum of %d and %d is: %d",num1,num2,sum);
		
		scanner.close();
	}
}