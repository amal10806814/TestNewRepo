package TestExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Practice.ReadFile;

public class MostRepeatedCharaterInFile {

	public static void main(String[] args) throws IOException {
		
		String a = "/Users/Chaudhary/Documents/testNew.txt";
		
		repeatMethod(a);

	}
	
	static void repeatMethod(String x) throws IOException
	{
		
		Map<String, Integer> m = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(x));
		
		String line = br.readLine();
		
		while(line!=null)
		{
			
			String[] s = line.split(" ");
			
			for(int i = 0 ; i < s.length; i++)
			{
			
			if(m.containsKey(s[i]))
			{
				m.put(s[i], m.get(s[i]) +1);
				
			}
			else
			{
				m.put(s[i], 1);
			}
				
			}
			
			line = br.readLine();
		
		}
		
		System.out.println(m);
		
		
		int max = Integer.MIN_VALUE;
		
		String value = "";
		
		for(Map.Entry<String, Integer> me : m.entrySet())
		{
			
			if(max< me.getValue() )
			{
				max = me.getValue();
				value = me.getKey();
			}
		}
		
		System.out.println( max + " "+ value);
		
	}

}
