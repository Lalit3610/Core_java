//check weight program//

package TestLk;

public class Exception
         {
	class MyException extends Exception {
		public MyException(String s)
		{
			super(s);
		}
	 }
	class ProductCheck
	{
		int weight;
		
		public ProductCheck(int weight)
		{
			this.weight=weight;
		}

		void display() {
			System.out.println("product is valid");
		}
	}

	public class Product 
             {

		public static void main(String[] args) {
			try {
			int ProductWeight = 110;
			if(ProductWeight >130)   
			{
			System.out.println("product weight is "+ProductWeight);
			}
			}
			catch (Exception e)		
			{
			System.out.println(e);
			}
			System.out.println("product weight  is invalid");
			
			
			
			
			
		}

	      }
            }