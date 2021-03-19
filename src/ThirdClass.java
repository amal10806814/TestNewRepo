
public class ThirdClass {
	
//	public static void main(String[] args) {
//		
//		parentClass p = new childClass();
//		
////		p.name = "amal";
////		System.out.println(p.name);
//		
//		p.method();
//		
//		//childClass c = new parentClass();
////		
////		childClass c = (childClass) p ; 
////		
////		c.id=10;
////		System.out.println();
//		
//	}

	
	public static void main(String[] args) {
		int i= getNumber(10);

		    }

	public static int getNumber(int num){
		try{
			int x = num/0;
		return 20;
		}
		catch(ArithmeticException ae){
		return 30;
	}
		finally
		{
			return 40;
		}

		 return 100;
		    }
}
