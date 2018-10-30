
public class ReverseString {

	public static void main(String[] args) {
		
		//Do we revers function in reverse function 
		String s= "Abhishek ";
		
		//s.reverse Method is not avilable becuse String is immutable Object 
		//Mutable object – You can change the states and fields after the object is created. For examples: StringBuilder , java.util.Date and etc. ...
		//Immutable object – You cannot change anything after the object is created. For examples: String , boxed primitive objects like Integer 
		 int len=s.length();
		 String revString="";
		 
		 for( int i=len-1;i>=0; i--)
		 {
			 revString=revString+ s.charAt(i);//mu
			 			 
		 }
		 System.out.println(revString);
		 
		 StringBuffer sb= new StringBuffer(s);
		  
		 System.out.println(sb.reverse());
		
		
		 

	}

}
