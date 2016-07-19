# bharathikalai
import java.util.Scanner;


public class Vowel {
public static void main(String[] args) {
	char ch;

	Scanner A=new Scanner(System.in);
	
	System.out.println("enter the alphabet");
	ch=A.next().charAt(0);
	
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
	{
		System.out.print("vowel:"+ch);
	}
	else
	{
		System.out.print("constant");
	}

	}

}
