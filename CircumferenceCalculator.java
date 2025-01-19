import java.util.Scanner;
public class CircumferenceCalculator {
	public static void main(String[] args){
		final double PI = 3.141;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		
		double radius = scanner.nextDouble();
		double circumference = 2 * PI * radius;
		System.out.println("The circumference of the circle is: "+ circumference);
		scanner.close();
	}
}