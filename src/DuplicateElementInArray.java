
public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a ={4,5,6,7,4,6,10};
		
		for(int i =0 ; i< a.length ; i++) //O(n*n)
		{
			for(int j = i+1; j< a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
				else
				{
					continue;
				}
			}
		}
	}

}
