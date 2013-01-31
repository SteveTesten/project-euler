package common;

import java.math.BigInteger;

public class tools
{
	public static boolean isPrime(long num)
	{
		if (num<2)
			return false;
		if (num==2)
			return true;
		if (num%2==0)
			return false;
		
		for (long i = 3; (i*i)<=(num); i+=2)
		{
			if (num%i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isPalindrome(int num)
	{
		boolean result = true;
		
		String numstring = Integer.toString(num);
		
		int len = numstring.length();
		
		for (int i=0; i<=(len/2); i++)
		{
			if (numstring.charAt(i) != numstring.charAt(len-(i+1)))
			{
				result = false;
			}
		}
		
		return result;
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
