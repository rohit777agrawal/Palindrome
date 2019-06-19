import java.util.Scanner;

// a Palindrome is number equal to its reversed   121= 121
public class NumberPalindrome {
	
	public static void main (String[] args)
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number to check for Palindrome");
		int palindrome = keyboard.nextInt();
		System.out.println(isPalindrome(palindrome));
	}
	
	public static boolean isPalindrome (int number)
	{
		int reverse=0;
		int newNumber=number;
		int remainder =0;
		while (newNumber != 0)
		{
			remainder = newNumber%10;
			newNumber= newNumber/10;
			reverse = (reverse*10) + remainder;
		}
		
		if (reverse == number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
