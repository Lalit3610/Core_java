import java.util.Scanner;  //Importing scanner class

public class Weekdays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);  	//Creating the instance of the scanner class
		System.out.println("Enter any number to check the day");
		System.out.println("Only between 1 and 7");
		int num = sc.nextInt();	  //Storing the user inputted number in the variable num

		System.out.println("Choosen number is "+ num);

		switch(num)	  //passing the number
		{
			case 1:
			{
				System.out.println("today is Monday");
				break;
			}
			case 2:
			{
				System.out.println(" today is Tuesday");
				break;
			}
			case 3:
			{
				System.out.println("today is Wednesday");
				break;
			}
			case 4:
			{
				System.out.println("today is Thursday");
				break;
			}
			case 5:
			{
				System.out.println(" today is Friday");
				break;
			}
			case 6:
			{
				System.out.println("  today is Saturday");
				break;
			}
			case 7:
			{
				System.out.println("today is Sunday");
				break;
			}
			default:
				System.out.println("please entere the valid information");
		}
	}
}