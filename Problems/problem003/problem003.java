/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?
*/

public class problem003
{

	public static void main(String[] args)
	{
		
		long number = 600851475143L;
//		long number = 13195L;
		
		for (long i=2; i<number; i++)
		{
			if (isPrime(i) == true && number%i == 0)
				System.out.println(i);
		}
		
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
