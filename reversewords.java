import java.util.*;

public class reversewords{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence to reverse");
		String sent=sc.nextLine();
		String[] word=sent.split(" ");
		int i;
		int len;
		len=word.length;
		for(i=len-1;i>=0;i--)
		{
			System.out.print(word[i]+" ");
		}
		
		
	}
}
