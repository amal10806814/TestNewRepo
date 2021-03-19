package Practice;

public class Match {

	public static void main(String[] args) {
		
		String s = "yah73298ap@@p";  //yahapp
		
		char[] ch = s.toCharArray();
		
		String s1 = "happy";
		
		char[] ch1 = s.toCharArray();
		
		String s3 = " ";
	

		for(int i = 0 ; i< ch.length ; i++)
		{
			if(Character.isDigit(ch))
			{
				s3 = s3+ x;
			}
		}
	
		for(int i = 0 ; i <ch.length ; i++)
		{
			for(int j = i+1; j< ch.length ; i++)
			{
			if(ch[i]==ch1[j])
			{
				System.out.println();
			}
			}
		}

	}

}
