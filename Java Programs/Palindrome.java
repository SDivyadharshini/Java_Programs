import java.util.Scanner;
public class Palindrome
{

	public static void main(String[] args) 
	{
		String original, reverse = ""; 
	      Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome: ");  
	      original = scan.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("It is a palindrome.");  
	      else  
	         System.out.println("It is not a palindrome."); 

	}

}
