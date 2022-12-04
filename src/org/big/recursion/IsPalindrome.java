package org.big.recursion;

public class IsPalindrome {

	public static void main(String[] args)
	{

		System.out.println(isPalindrome("awesome"));

		System.out.println(isPalindrome("foobar"));

		System.out.println(isPalindrome("tacocat"));

		System.out.println(isPalindrome("malayalam"));

	}

	static boolean isPalRec(String str, int start, int end)
	{
		// If there is only one character
		if (start == end)
			return true;

		// If first and last
		// characters do not match
		if ((str.charAt(start)) != (str.charAt(end)))
			return false;

		// If there are more than
		// two characters, check if
		// middle substring is also
		// palindrome or not.
		if (start < end + 1)
			return isPalRec(str, start + 1, end - 1);

		return true;
	}

	static boolean isPalindrome(String str)
	{
		int n = str.length();

		if (n == 0)
			return true;

		return isPalRec(str, 0, n - 1);
	}

}
