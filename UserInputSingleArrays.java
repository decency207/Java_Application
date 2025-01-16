public class UserInputSingleArrays{
	public static void main(string args[]){
		Scanner scan = new Scanner(System.in);
		String[] names = String[5];
		
		
		for(int i = 0, i < 5; i++){
			
			System.out.print("Enter name: ");
			String name = scan.nextLine();
			names[i] = scan.nextLine();
		}
		
		for(int i = 0;  i < 5; i++){
			System.out.printf("Element at index %d = %s%n",i,names[i]);
		}
	}