import java.util.Scanner;
public class Reverse_Number 
{
public static void main(String[] args)
	{
		int number;
		int reverse;
		System.out.println("Enter any Number: ");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		while(number>0)
		{
			reverse = number%10;
			System.out.print(reverse);
			number=number/10;
		}

	}

}
