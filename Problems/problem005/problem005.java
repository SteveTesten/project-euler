
/*2520 is the smallest number that can be divided
 by each of the numbers from 1 to 10 without any
 remainder.

What is the smallest positive number that is evenly
divisible by all of the numbers from 1 to 20?
*/

public class problem005
{

	public static void main(String[] args)
	{
		int limit1 = 1;
		int limit2 = 20;
		int answer = 0;
		int term = limit2;
		
		while (answer==0)
		{
			for (int i=limit1; (i<=limit2) && (term%i==0); i++)
				if (i==limit2)
					answer=term;
		
			term+=limit2;
		}
		System.out.println(answer);
	}

}
