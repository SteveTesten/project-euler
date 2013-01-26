//(n is even)-> n/2
//(n is odd)->3n+1

public class problem014
{
	public static void main(String[] args)
	{
		int max = 1000000;
		long step = 0;
		int count = 0;
		int best = 0;

		for (int i=1; i<max; i++)
		{
			step=i;
			count=0;

			while (step!=1)
			{
				if (step%2==0)
				{
					step=step/2;
				}
				else
				{
					step=3*step+1;
				}
				
				count=count+1;
			}

			if (count>best)
				{
					best=count;
					System.out.println("Term: " + i + ", Best: " + best);
				}
		}
	}
}