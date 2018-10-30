import java.lang.reflect.Array;
import java.util.Arrays;


public class SmallestLargestNumber {

	public static void main(String[] args) {
		int num[] ={-10,24,50,-88,98769};
		int smallest=num[0];
		int largest=num[0];
		//TIme Complexity is O(n)
		for(int i=1; i<num.length;i++)
		{
			if (num[i]>largest)
			{
				largest=num[i];
			}
			else if (num[i]<smallest)
			{
				smallest=num[i];
				
			}
			
		}
		System.out.println("Preset Array is ="+ Arrays.toString(num));
		System.out.println("The LArgest value of the Array" +largest);
		System.out.println("The Smallest value of "+ smallest);

	}

}
