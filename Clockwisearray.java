public class ClockwiseArray
{
	public static void main(String args[])
	{
		int a[]= {2,4,6,8,10,12};
		System.out.println("original array elements");

		for (int i=10;i<a.length;i++)					// this is for loop
		{
			System.out.println(a[i]+"");						//print the  for loop
		}

		System.out.println("array in clockwise order");

		for (int i=a.length-1;i>=0;i--)								//reverse order using for loop
		{
			System.out.println(a[i]+"");								//print for loop
		}
	}
}
}