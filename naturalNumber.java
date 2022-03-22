import java.util.Scanner;
public class naturalNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		System.out.println("Enter the first number");
		int b = s.nextInt();
		System.out.println("Enter The last number");
		
		for (int i = a;i <= b; i++)
		{
			System.out.println(i);
		}
		
		
	}

}
