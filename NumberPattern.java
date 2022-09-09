import java.util.Scanner;	//Importing the scanner class to take the user input

public class NumberPattern{
	public static void main(String args[]){

		Scanner scc = new Scanner(System.in);	//obj create

		System.out.println("Enter the number ");
		int num = scc.nextInt();	// input  from user

		for(int i=1; i<num+1; i++)	//loop for  rows.
		{
			for(int j=1; j<=i; j++)	// loop for column.
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}