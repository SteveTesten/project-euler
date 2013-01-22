/*Find the difference between the sum of the
squares of the first one hundred natural
numbers and the square of the sum.
 */

public class problem006
{


	public static void main(String[] args)
	{
		int lowLimit = 1;
		int highLimit = 100;
		int sqsum = 0;
		int sumsq = 0;
		
		for (int i=lowLimit; i<=highLimit; i++)
		{
			sqsum += (i*i);
			sumsq += i;
		}
		
		sumsq *= sumsq;
		System.out.println(sumsq - sqsum);
		
	}

}
