/*Each new term in the Fibonacci sequence is generated
by adding the previous two terms. By starting with 1
and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose
values do not exceed four million, find the sum of the
even-valued terms.
*/

public class problem002
{

	public static void main(String[] args)
	{
		int term1 = 1;
		int term2 = 2;
		int sum = 0;
		int temp = 0;
		
		while (term2 < 4000000)
		{
			if (term2 % 2 == 0)
			{
				sum = sum + term2;
			}
			temp = term1;
			term1 = term2;
			term2 = term2 + temp;
		}
		
		System.out.println(sum);
	}

}
