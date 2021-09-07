import java.util.Scanner;
public class Calculator
{
public static void main(String[] args)
{
	char operator;
	Double number1,number2,output;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter First Number :");
	number1=scan.nextDouble();
	System.out.println("Choose an Operator : +,-,*,/ ");
	operator=scan.next().charAt(0);
	System.out.println("Enter Second Number :");
	number2=scan.nextDouble();
	switch(operator)
	{
	case '+':
	output = number1 + number2;
	System.out.println(number1 + " + " + number2 + " = " + output);
	break;
	case '-':
	output = number1 - number2;
	System.out.println(number1 + " - " + number2 + " = " + output);
	break;
	case '*':
	output = number1 * number2;
	System.out.println(number1 + " * " + number2 + " = " + output);
	break;
	case '/':
	output = number1 / number2;
	System.out.println(number1 + " / " + number2 + " = " + output);
	break;
	default:
	System.out.println("Invalid operator!");
	break;
	}

	}

}
