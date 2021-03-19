import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";
		
		
		boolean flag = true ;
		
		String x = s1.replaceAll("\\s", "").toLowerCase();
		
		char [] a = x.toCharArray();
		Arrays.sort(a);
		
		
		String y = s2.replaceAll("\\s", "").toLowerCase();
		char [] b = y.toCharArray();
		
		Arrays.sort(b);
		
		for(int i=0 ; i< x.length();i++)
		{
			if(a[i]!=b[i])
			{
				flag = false;
				
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(flag);
	}

}
