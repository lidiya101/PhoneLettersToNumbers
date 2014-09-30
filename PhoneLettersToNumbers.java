/**
Author: Drew Kestell
Date: 9/22/2014
E-mail: drew.kestell@gmail.com
Exercise Status: Complete

This application will convert phone numbers containing both alphabetical
and numerical characters into only numerical characters.  For example, 
phone numbers typically used by businesses such as 1-800-KESTELL would be
converted into 1-800-537-8355.
*/

package DPEX;

import java.lang.StringBuilder;
import java.util.Hashtable;

public class PhoneLettersToNumbers
{

	public static void main(String[] args)
	{
		String businessNumber = "1-800-KESTELL";
		char[] businessNumberArray = businessNumber.toCharArray();
		Hashtable<Character, Character> alphabet = new Hashtable<Character, Character>();
		StringBuilder convertedNumber = new StringBuilder();
		
		alphabet.put('A', '2');
		alphabet.put('B', '2');
		alphabet.put('C', '2');
		alphabet.put('D', '3');
		alphabet.put('E', '3');
		alphabet.put('F', '3');
		alphabet.put('G', '4');
		alphabet.put('H', '4');
		alphabet.put('I', '4');
		alphabet.put('J', '5');
		alphabet.put('K', '5');
		alphabet.put('L', '5');
		alphabet.put('M', '6');
		alphabet.put('N', '6');
		alphabet.put('O', '6');
		alphabet.put('P', '7');
		alphabet.put('Q', '7');
		alphabet.put('R', '7');
		alphabet.put('S', '7');
		alphabet.put('T', '8');
		alphabet.put('U', '8');
		alphabet.put('V', '8');
		alphabet.put('W', '9');
		alphabet.put('X', '9');
		alphabet.put('Y', '9');
		alphabet.put('Z', '9');
		alphabet.put('1', '1');
		alphabet.put('2', '2');
		alphabet.put('3', '3');
		alphabet.put('4', '4');
		alphabet.put('5', '5');
		alphabet.put('6', '6');
		alphabet.put('7', '7');
		alphabet.put('8', '8');
		alphabet.put('9', '9');
		alphabet.put('0', '0');
		alphabet.put('-', '-');
		
		for (int i = 0; i < businessNumberArray.length; i++)
		{
			convertedNumber.append(alphabet.get(businessNumberArray[i]));
			if (i == 8)
			{
				convertedNumber.append("-");
			}
		}
		
		System.out.print(convertedNumber);
	
	}
}