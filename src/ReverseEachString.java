
public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Java Concept Of The Day";
		
		reverseEachString(x);
		
	}
	
	static void reverseEachString(String s)
	{
			
		String[] a = s.split(" ");
		
		//int l = a.length;
		
		for(int i =0; i < a.length;i++) //O(n*n)
		{
			for(int j = a[i].length()-1; j>=0;j--)
			{
				
				
			System.out.print(a[i].charAt(j));
			
			
			}
			System.out.print(" ");
		}
	}

}
