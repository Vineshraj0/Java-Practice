import java.util.*;

public class countuniquechar{

		public static void main(String args[])
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String ");
			String name=sc.next();
			n=name.length();
			char[] temp=new char[n];
			System.out.println("The string is: "+name);
			System.out.println("Length of string is: "+n);
			int i;
			for(i=0;i<n;i++)
			{
				temp[i]=name.charAt(i);
			}
			int j,count=0;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(temp[i]==temp[j])
					{
						count++;
					}
					
				}
			}
			
			System.out.println("Number of repeated characters: "+count);
			int uniq;
			uniq=n-count;
			System.out.println("Number of unique characters: "+ uniq);
			
			
			
		}

}
