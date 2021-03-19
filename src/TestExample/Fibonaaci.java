package TestExample;

import java.util.ArrayList;

public class Fibonaaci {

	public static void main(String[] args) {
		
		int val = 13;
		
	   fibonacci(val);
		
		
	}
	
	static void fibonacci(int num)
	{
		
		int l = 10;
		
		int a = 0 ; 
		
		int b = 1 ;
		
		
		// 0 1 1 2 3 5 8 13
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0 ; i<=10;i++ )
		{
			
			int temp = a+b; //5
			
			  a=b; //3
			  
			  b =temp; //5
			
			
			al.add(temp);
			
			
		}
		
		if(al.contains(num))
		{
			System.out.println("fibonacci no");
		}
		else
		{
			System.out.println("not a fibonacci no");
		}

	}

}
