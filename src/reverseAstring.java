import java.util.Arrays;

public class reverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		
		char[] ch = s.toCharArray();
		
		for(int i =0 ; i < ch.length/2 ; i ++)
		{
			char temp = ch[i];
			
			ch[i]= ch[ch.length-1-i];
			ch[ch.length-1-i]= temp;
			
		}
		
		System.out.println(String.valueOf(ch));

	}

}
