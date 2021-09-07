import java.util.Scanner;
public class Swapping 
{
public static void main(String[] args) 
{
		System.out.println("Enter Two Numbers: ");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before swapping :" +a+ " "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping: " +a+ " "+b);

	}

}
