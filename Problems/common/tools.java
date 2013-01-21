
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

}
