package TestExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedAndNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "JavaConceptOfTheDay";
		
		repeatedCharacter(s);
		
	}
	
	
	static void repeatedCharacter(String a)
	{
		char[] ch = a.toCharArray();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i<ch.length; i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i]) +1);
			}
			
			else
			{
				map.put(ch[i], 1);
			}
		}
		
		
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> mm : map.entrySet())
		{
			if(mm.getValue()==1)
			{
				System.out.println(mm.getKey());
				break;
			}
			
		}
		
		
		for(Map.Entry<Character,Integer> mm : map.entrySet())
		{
		if(mm.getValue()>1)
		{
			System.out.println(mm.getKey());
			break;
		}
		}
	}

}
