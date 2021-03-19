import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfEachElement {
	
	public static void main(String[] args) {
		
		int[] a = {1,3,4,5,1,2,5,5};
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i]) +1);
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm);
		
		
		//hm.entrySet()
		
		for(Map.Entry<Integer, Integer> ss : hm.entrySet())
		{
			System.out.println(ss.getKey() +"-- "+ ss.getValue());
		}
	}

}
