
/*There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class problem009
{

	public static void main(String[] args)
	{
		int maxA = 500;
		int maxB = 500;
		double c = 0;
		double answer = 0;
		double ansA = 0;
		double ansB = 0;
		double ansC = 0;
		
		for (int a=1; a<maxA; a++)
		{
			for (int b=(a+1); b<maxB; b++)
			{
				c = Math.sqrt(a*a + b*b);
				if (a+b+c==1000)
					{
					answer = a*b*c;
					ansA = a;
					ansB = b;
					ansC = c;
					}
				
			}
		}
		
		System.out.println("The answer is: " + (int)answer);
		System.out.println("a="+ (int)ansA + " b=" + (int)ansB + " c=" + (int)ansC);
		System.out.println("Your code is bad and you should feel bad. :(");
	}

}