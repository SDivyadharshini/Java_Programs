import java.util.Scanner;
public class Addition 
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Two Numbers: ");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int sum=num1+num2;
	System.out.println("The Addition of 2 Numbers:" + sum);
	}

}