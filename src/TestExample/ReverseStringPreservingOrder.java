package TestExample;

import java.util.Arrays;

public class ReverseStringPreservingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I Am Not String";
		
		char[] ch = s.toCharArray();
		
		char[] ch1 = new char[ch.length];
		
		
		for(int i =0 ; i < ch.length;i++)
		{
			if(ch[i]== ' ')
			{
				ch1[i]=' ';
			}
			else
			{
				continue;
			}
			
		}
		
		int j = 0;
		
		//I Am Not String"
		
		for(int i = ch.length-1 ; i >= 0;i--)  //I
		{
			
			if(ch[i]!= ' ')
			{
				
				if(ch1[j]==' ')
				{
					j++;
				}
				
				ch1[j] = ch[i];  //I
				j++;
			}
		}
		for(char x : ch1)
		
		System.out.print(x);
	}

}
