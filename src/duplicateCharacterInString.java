import java.util.HashMap;

public class duplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Butter Butter";
		
		char[] ch = s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(hm.containsKey(ch[i]))
			{
				hm.put(ch[i], hm.get(ch[i]) +1);
			}
			
			else
				hm.put(ch[i], 1);
		}
		
		System.out.println(hm);
	}

}
