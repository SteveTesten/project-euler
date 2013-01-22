/*What is the 10 001st prime number?*/

public class problem007
{

	public static void main(String[] args)
	{
		int term = 1;
		int prime = 0;
		int goal = 10001;
		
		while (prime!=goal)
		{
			term++;
			if (isPrime(term))
				prime++;
		}
		
		System.out.println(term);
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
