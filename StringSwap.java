
public class StringSwap {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		a=a+b;//HelloWorld
		b=a.substring(0, a.length()-b.length());//Hello
		//Store  b 
		a=a.substring(b.length());
		System.out.println("THe value is a"+"  "+a);
		System.out.println("THe value is b"+"  "+b);
        
	}

}
