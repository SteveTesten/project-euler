//Calculate the sum of all primes below 2 million.  

public class problem010
{

	public static void main(String[] args)
	{
		int maxNumber = 2000000;
		long answer = 0;
		
		for (int i=2; i<=maxNumber;i++)
			if (isPrime(i))
					answer+=i;
		
		System.out.println("The answer is: " + answer);
	}

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
}
