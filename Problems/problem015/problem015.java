/*How many routes are there through a 20x20 grid?

This can be calculated using Pascal's triangle.

This code only works up to grid_size 10 because >20! is too
large to be calculated with a long (must use BigInteger).

The answer is (40!/(20!*20!))=137846528820.

See problem015b.java for the correct code.
*/

public class problem015
{
	public static void main(String[] args)
	{
		int grid_size = 10; //length of one side (max 10)
		int n = grid_size*2;
		int k = grid_size;

		long answer = factorial(n)/(factorial(k)*factorial(n-k));
		System.out.println(answer);

	}

	public static long factorial(int num)
	{
		long result = 1;

		if (num > 1)
		{
			for (int i=1; i<=num; i++)
				result=i*result;
		}

		return result;
	}
}