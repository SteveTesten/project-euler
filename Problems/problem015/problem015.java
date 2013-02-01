/*How many routes are there through a 20x20 grid?

This can be calculated using Pascal's triangle.

This code only works up to grid_size 10 because >20! is too
large to be calculated with a long (must use BigInteger).

The answer is (40!/(20!*20!))=137846528820.

See problem015b.java for code that replicates pascal's triangle.
*/

import java.math.BigInteger;

public class problem015
{
	public static void main(String[] args)
	{
		int grid_size = 20; //length of one side (max 10)
		long n = grid_size*2;
		long k = grid_size;

		BigInteger numerator = factorial(n);
		BigInteger denominator = factorial(k).multiply(factorial(n-k));
		BigInteger answer = numerator.divide(denominator);
		System.out.println(answer);

	}

	public static BigInteger factorial(long num)
	{
		BigInteger temp_num = BigInteger.valueOf(1);

		for (long i = 1; i <= num; i++)
		{
			temp_num = temp_num.multiply(BigInteger.valueOf(i));
		}

		return temp_num;
	}
}