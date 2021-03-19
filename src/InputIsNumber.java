import java.util.Scanner;

public class InputIsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		System.out.println(inputNumber(input));
	}
	
	static boolean inputNumber(String s)
	
	{
		
		boolean flag = false;
		
		int a = Integer.parseInt(s);
		flag = true;
		
	return flag;
		
		
	}

}
