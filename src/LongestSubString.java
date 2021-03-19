import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "javaconceptoftheday";
		
		//output = "oftheday"
		
		findlongestSubstring(s);
		
	}
	
	 	static void findlongestSubstring(String s)
	 	{
	 		
	 		char[] ch = s.toCharArray();
	 		
	 		int count =0;
	 			
	 	Map<Character,Integer> m = new HashMap<>();
	 	
	 	
	 	for(int i =0 ; i < ch.length; i++)
	 	{
	 		
	 		if(m.containsKey(ch[i]))
	 		{
	 			i =m.get(ch[i]);
	 			
	 			i=i+1;
	 			
	 			count =0;
	 			
	 			m.clear();
	 		
	 			
	 		}
	 		
	 		else
	 		{
	 			m.put(ch[i], i );
	 			
	 			count ++;
	 		}
	 	}
	 	
	 	System.out.println(count);
	 	System.out.println(m);
	 		
	 }
	 		
}


