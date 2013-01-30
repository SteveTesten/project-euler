//Find the sum of the digits in the number 100!


import java.math.BigInteger;

public class problem020
{
	public static void main(String[] args)
	{
		long num = 100;
		

		BigInteger num_bigint = factorial(num);
		String num_string = num_bigint.toString();
		int temp_sum = 0;

		for (int j=0; j<num_string.length(); j++)
		{
			temp_value += Integer.parseInt(Character.toString(num_string.charAt(j)));
		}

		System.out.println(temp_value);
		
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