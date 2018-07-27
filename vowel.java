/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner sc=new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' )
			 System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}	

