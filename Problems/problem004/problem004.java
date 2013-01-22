/*A palindromic number reads the same both ways.
The largest palindrome made from the product of
two 2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product
of two 3-digit numbers.
*/

public class problem004
{

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

	public static void main(String[] args)
	{
		int limit1 = 100;
		int limit2 = 999;
		int answer = 0;
		
		for (int i=limit1; i<=limit2; i++)
			{
			for (int j=limit1; j<=limit2; j++)
				{
					int temp = i*j;
					if (isPalindrome(temp) && temp > answer)
						{
							answer = temp;
							//System.out.println(temp);
						}
				}
			}				
		
		System.out.println(answer);
		
	}

}
