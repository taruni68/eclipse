package CTSdemo;
import java.util.*;
public class vowels {
private static Scanner sc;

public static void main(String[] args)
{
	int i,count=0;
	System.out.println("Enter the sentence: ");
	sc = new Scanner(System.in);
String a=sc.nextLine();
for(i=0;i<a.length();i++)
{
	char ch=a.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' '||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		count++;
		
	}}
	System.out.print(" "+count);
}

}