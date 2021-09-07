import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args)
	{
		System.out.println("Enter any Number :");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		if(number%2==0)
		{
		System.out.println( number + " is Even Number");
		}
		else
		{
		System.out.println( number + " is Odd Number");
		}

	}

}
