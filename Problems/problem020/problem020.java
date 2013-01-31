//Find the sum of the digits in the number 100!

//To compile: javac problem020.java ../common/tools.java


import java.math.BigInteger;
import common.tools;

public class problem020
{
	public static void main(String[] args)
	{
		long num = 100;
		

		BigInteger num_bigint = tools.factorial(num);
		String num_string = num_bigint.toString();
		int temp_sum = 0;

		for (int j=0; j<num_string.length(); j++)
		{
			temp_sum += Integer.parseInt(Character.toString(num_string.charAt(j)));
		}

		System.out.println(temp_sum);
		
	}
}