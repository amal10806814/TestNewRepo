import java.util.Scanner;

public class ReverseUntilPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int b = s.nextInt();  //45637
		
		reverseAndAdd(b);
	}

	
	static boolean checkPalindrome(int a ) //45637
	{
		boolean flag = false;
		int revNum = reverseNumber(a); //73654
		
		if(a ==revNum) 
		{
			flag = true;
			return flag;
		}
		
		return flag; //false
	}
	
	
	static int reverseNumber(int n)  //45637
	{
		int reverse = 0;
		int rem = 0;
		
		while(n!=0) //4
		{
			rem = n%10; //4
			
			reverse = (reverse*10) + rem; //73654
			
			n =n/10; //
		}
		
		return reverse;
	}
	
	static void reverseAndAdd(int a)  //45637
	{	
	
		if(checkPalindrome(a)==true)
		{
			System.out.println("no is palindrome");
		}
		
		else
		{
		while(!checkPalindrome(a))
		{
		
		int reversedNumber = reverseNumber(a); //73654
		
		int sum = a +reversedNumber ;  //45637+73654
		
		System.out.println(a+"+"+ reversedNumber + "=" + sum);
		
		a = sum;
		
		}
		}
	}
}
