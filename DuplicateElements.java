import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateElements {

	public static void main(String[] args) {
		String names[] =  {"java","kava","Seelinum","java","kava","kava"};
		//Compair  with Each element 
		//We are using 2 for loop so TIme cmplexity would be o(n*n) 
				for (int i=0;i<=names.length;i++)
		{
			for(int j =i+1;j<names.length;j++)
			{
				if (names[i].equals(names[j]))
				{
					System.out.println("Duplicate value is "+ names[i]);
				}
			}
		}
		//2. Using Hash Set Java Collection --> It Stors Uniqe Value . 
		HashSet<String> store = new HashSet<String>();
		//Set Is the Interface and HAsh Set is the class , Child class object can be refer 
		// Can be reffred as parent variable,Here Time complexcity o*(n)
		 for (String name: names)
		 {
			 if(store.add(name)== false)
            System.out.println("Duplicate value is--> " +name);			 
			 
		 }
		 
		 //Using Hashmap --> In Hash map Duplicate elements are allowed , 
		   // HashMap stroing the value in Key & Value format ,so Key Will be Strig and Value will be Intefet
		 // Time Complexity o(2n)
		Map<String,Integer> storemap =new HashMap<String,Integer>();
		 for( String name:names)
		 {
			 Integer count=storemap.get(name);
					 if (count==null)
					 {
						 storemap.put(name,1);
						 
					 }
					 else {
						 storemap.put(name,++count);
						 
					 }
		 }
		
		 //Get the value from HashMap
		  Set<Entry<String,Integer>> objEntrySet= storemap.entrySet();
		  for(Entry<String,Integer>entry:objEntrySet )
		  {
			if(entry.getValue()>1)
			{
				System.out.println("Duplocate Element is --< "+ entry.getKey());
			}
		
		  }
	}


}
