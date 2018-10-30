import java.util.HashMap;
import java.util.Scanner;


public class HashT {

	public static void main(String[] args) {
		
	HashMap<String,Integer>  map = new HashMap<String,Integer>();
	
	Scanner  txtFile= new Scanner("C:\\Users\\sir\\Desktop\\Resume\\CoverLetter");
	int count=0;
	  while(txtFile.hasNext())
	 {
		String word = txtFile.next();
		
		if(map.containsKey(word))
		{
			 count=map.get(word)+1;
			map.put(word, count);
			
		}
		else 
		{
			
			map.put(word, count);
			
		}
		 
	
	 }
	 txtFile.close();

	}

}
