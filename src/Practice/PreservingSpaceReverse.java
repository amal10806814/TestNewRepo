package Practice;

import java.util.Arrays;

public class PreservingSpaceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "i am the best person";
		
		char[] ch = s.toCharArray();
		
		
		char[] ch1 = new char[ch.length];
		
		for(int i =0 ; i < ch.length; i++)
		{
			if(ch[i]== ' ')
			{
				ch1[i] = ' ';
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(Arrays.toString(ch1));
		
		int j = ch1.length-1;
		
		for(int k = 0 ; k< ch.length ;k++ )
		{
			
			if(ch[k]!= ' ')
			{
			
				if(ch1[j]== ' ')
			{
				j--;
				
			}
			
				ch1[j] =ch[k];
				j--;
		
		}
		System.out.print(Arrays.toString(ch1));

	}

}
}
