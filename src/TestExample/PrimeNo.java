package TestExample;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		
		int a = s.nextInt();  //2
		
		int m = a/2; //1
		
		boolean flag = true;
	
			if(a==0||a==1)
			{
				System.out.println("no is not prime");
			}
			
			else 
			{
				for(int i = 2 ; i <=m ; i++)
				{
				if(a%i==0)
				{
					flag = false;
					break;
				}
				
			}
			
			}
			
			if(flag)
			{
				System.out.println(a +":"+ "Prime");
			}
			else
			{
				System.out.println(a +":"+"not prime");
			}
	}
}

