package CTSdemo;

public class Charat {
public static void main(String[] args)
{
	String sentence="Welcome To Selenium Automation Testing";
	int len=sentence.length();
	System.out.println("string length is:"+len);
	char ch=sentence.charAt(8);
	System.out.println("character at 8th position is:"+ch);
}
}
