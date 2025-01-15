import java.util.Scanner;
import java.util.Random;
          public class RandomNumberGenerator{
          public static void main(String args []){
          Scanner scanner = new Scanner(System.in);
          Random random = new Random();
          System.out.print("Enter the upper limit to be generated: ");
		  int uppperlimit = scanner.nextInt();
		  
		  if(uppperlimit == 0){

			  System.out.println("The number must be greater than 0");
		  }
		  else{
			  int randomNum = random.nextInt(uppperlimit) + 1;
			  System.out.printf("The Generated Random Number from 0 - %d is: %d%n",uppperlimit,randomNum);
		  }
	}    
}
		  
		