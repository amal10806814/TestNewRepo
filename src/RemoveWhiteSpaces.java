import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "b utte r";
		
		System.out.println(removeWhiteSpaces(s));
		
	}
	
	public static String removeWhiteSpaces(String x)
	
	{
		char[] ch = x.toCharArray();
	
		String s =" ";
		
		for(int i =0 ; i < ch.length ; i++)  //O(n)
		{
			//if(!String.valueOf(ch[i]).equals(" "))
			
			if(ch[i]!= ' ')
			{
			
				s= s+ch[i];
			}
			
			else
			{
				continue;
			}
		}
		
		return s;
	}

}
