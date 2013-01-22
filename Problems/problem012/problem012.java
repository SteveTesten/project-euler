/* What is the value of the first triangle number 
to have over five hundred divisors? */

public class problem012
{

	public static void main(String[] args)
	{
		int target_divisors=500;
		int term=1;
		int divisors=0;
		int triangle_num=0;
		
		while (divisors<target_divisors)
		{
			divisors=0;

			triangle_num=triangle_num+term;

			for (int j=1;j<=triangle_num;j++)
			{
				if (triangle_num%j==0)
					divisors++;
			}

			System.out.println("Triangle number " + term + " is " + triangle_num + " and has " + divisors + " divisors.");

			term++;
		}
	}
}