//What is the sum of the digits in 2^1000?

import java.math.BigInteger;
import java.lang.Integer;

public class problem016
{
	public static void main(String[] args)
	{
		int sum = 0;
		int term = 0;

		BigInteger big_num = (BigInteger.valueOf(2)).pow(1000);
		String big_num_string = big_num.toString();
		int len = big_num_string.length();

		for (int i=0; i<len; i++)
		{
			term = Integer.parseInt(Character.toString(big_num_string.charAt(i)));
			sum = sum + term;
		}

		System.out.println(sum);
	}
}