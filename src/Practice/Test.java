package Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		String a = "ab1234abc34521";
				
				//“ab1234abc34521”; 
		
		char[] ch = a.toCharArray();
		
		ArrayList<Character> al = new ArrayList<Character>();
		
		for(char x : ch)
		{
			al.add(x);
		}
		
		HashSet<Character> hs = new HashSet<Character>(al);
		
		System.out.println(hs);
		

	}

}
