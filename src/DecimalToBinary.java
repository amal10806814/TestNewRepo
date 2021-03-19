import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();  //50
		
		conversion(x);

	}
	
	static void conversion(int a)
	{
		
		int rem = 0;
		String num = "";
		
		while(a>0)  //1
		{
			rem = a%2; //1
			
			num = rem+ num; // 110010
			
			a = a/2; //0
			
		}
		
		System.out.println(num);
		
	}

}
