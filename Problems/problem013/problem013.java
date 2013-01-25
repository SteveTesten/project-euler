/* Work out the first ten digits of the sum of
the following one-hundred 50-digit numbers. 
(Found in problem013.txt) */

//use BigInteger? (for cheaters)

import java.io.*;
import java.util.*;
import java.math.*;

public class problem013
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File txtfile = new File("problem013.txt");
		Scanner numfile = new Scanner(txtfile);
		BigInteger sum = new BigInteger("0");

		while (numfile.hasNextLine())
		{
			BigInteger nextline = new BigInteger(numfile.next());
			sum = sum.add(nextline);

		}
		
		System.out.println("The sum is: " + sum);
		String answer = (sum.toString()).substring(0,10);
		System.out.println("The answer is: " + answer);

	}


}