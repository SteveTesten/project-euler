/*
Find the maximum total from top to bottom
of the triangle in problem018.txt.
*/

import java.util.Scanner;
import java.io.*;

public class problem018
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int num_rows = 15;
		String filename = "problem018.txt";

		int[] [] pyramid_array = new int[num_rows] [num_rows];
		File txtfile = new File(filename);
		Scanner pyramid = new Scanner(txtfile);

		for (int i=0; i<num_rows; i++)
		{
			for (int j=0; j<=i; j++)
			{
				pyramid_array[i] [j] = pyramid.nextInt();
			}
		}

		for (int k = num_rows-2; k>=0; k--)
		{
			for (int l = 0; l<=k; l++)
			{
				if ((pyramid_array[k+1] [l])>(pyramid_array[k+1] [l+1]))
					pyramid_array[k] [l] += pyramid_array[k+1] [l];
				else
					pyramid_array[k] [l] += pyramid_array[k+1] [l+1];
			}
		}

		System.out.println("The answer is: " + (pyramid_array[0] [0]));
	}
}