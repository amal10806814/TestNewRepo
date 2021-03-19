package TestExample;
import javax.swing.plaf.synth.SynthStyleFactory;

public class NumericValues {

	public static void main(String[] args) {
		
			String s = "amal77choudhary";
			
		char[] ch = s.toCharArray();
		
		for(int i = 0 ; i < ch.length ; i++)
		{
			
			if(Character.isDigit(ch[i]))
			{
				System.out.println(ch[i]);
			}
			else
			{
				continue;
			}
		}

	}

}
