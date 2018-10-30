
public class StringManuplation {

	public static void main(String[] args) {
		//String is a collection of defferent  charactors whic is written in double qotes
		//Start inedex with   zero location 
		String str= "Yes Srated here rains is";
		String str1= "Yes srated here rains is";
		System.out.println( "Length of the String"+"  " +str.length());
		System.out.println("5th index of the String"+" "+ str.charAt(5));
		System.out.println("The Position of the S " +"  "+ str.indexOf('S'));//first ouccrence of s 
		System.out.println("Second occurance of s "+"  "+str.indexOf('s', str.indexOf('S')+1));//Second occurance of s
		System.out.println("Third occurance of s "+"  "+str.indexOf('s',20));//Second occurance of s
		System.out.println("postion of char and string also " +"  "+ str.indexOf("here"));
        System.out.println("If given string is not avalible It will retur -1" + str.indexOf("Hello"));//LIke we can put assertion if not avilable  then rturn -1 
        //String Compairsion
        System.out.println(" Result " + str.equals(str1));
        //Igone capitalcases 
        System.out.println("Result after ignore cases"+ str.equalsIgnoreCase(str1));
        //How to get substring
        System.out.println("substring " + str.substring(0, 12));
        // How to do you trim 
         String s = " Heloo Selenium   ";
         System.out.println("Trim function , remove onle bfore spaces and after spaces" + s.trim());
         //Replace Method 
         System.out.println("Middle  Space using  replace method " + s.replace(" ",""));
         String date= "28-11-2018";
         System.out.println("Replace with " + date.replace('-', '/'));
         //Split Method  return array 
         String test="Hello_Test_Selenium";
         String testval[]= test.split("_");
          for(int i=0;i<testval.length;i++)
          {
        	  System.out.println("THe valu of "+ testval[i]);
          }
          String x="Hello";
          String y="World";
           double a=100.50;
           int b=200;
           System.out.println(x+y);//HelloWorld
           System.out.println(a+b);//300
           System.out.println(x+a+y+b);//Hello100World200
           System.out.println(x+y+a+b);//HelloWorld100200
           System.out.println(a+b+x+y);//300HelloWorld
	}
	

}
