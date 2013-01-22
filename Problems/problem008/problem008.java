/*Discover the largest product of five
consecutive digits in the 1000-digit number.*/

import java.io.*;
import java.util.*;

public class problem008
{

	public static void main(String[] args) throws FileNotFoundException
	{
		//Reads the text file and turns it into
		//a long string on one line.
		File txtfile = new File("problem008.txt");
		Scanner numfile = new Scanner(txtfile);
		String numstring = new String();
		int answer = 1;
		int productlen = 5;
		
		while (numfile.hasNext())
		{
			numstring = numstring + numfile.nextLine();
		}
		
		int len = numstring.length();
		
		for (int i=0; i<=(len-productlen); i++)
		{
			int temp = 1;
			
			for (int j=0;j<productlen;j++)
			{
				char ichar = numstring.charAt(i+j);
				int iterm = Character.getNumericValue(ichar);
				temp*=iterm;
				
			}

			if (temp>answer)
				answer=temp;
			
		}
		
		System.out.println(answer);
	}

}
