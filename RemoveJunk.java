
public class RemoveJunk {

	public static void main(String[] args) {
		// How to remove junk charactor in the String  
		//Ans > Regular Expression we canuse 
		//Write the Regular Expression--> [^a-zA-Z0-9]
		
		String s= "$%$&$&$$ latin String &*^(&*^&^%";
		 s= s.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(s);
		 

	}

}
