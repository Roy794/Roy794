//Wishes
import java.util.Scanner;
public class conditionStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter time");
		int a = s.nextInt();
		if (a >= 1 && a <= 12)
		{
			System.out.println("Good morning!!");
		}
		else if (a >= 12 && a <= 16)
		{
			System.out.println("Good Afternoon!!");
		}
		
		else if (a >= 16 && a <= 21)
		{
			System.out.println("Good Evening!!");
		}
		
		else
		{
			System.out.println("Good night!!");
		}

	}

}
