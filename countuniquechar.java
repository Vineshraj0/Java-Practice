import java.util.*;
//This program is to find count of repeated characters
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
			int tempcount=0;
			for(i=0;i<n;i++)
			{
				temp[i]=name.charAt(i);
			}
			int j,count=0,zcount=0;
			for(i=0;i<n;i++)
			{
				count=1;
				for(j=i+1;j<n;j++)
				{
					if(temp[i]==temp[j])
					{
						count++;
						temp[j]='0';
					}
					
				}
				if(temp[i]=='0')
				{
					zcount++;
				}
				if(count>1 && temp[i]!='0')
				{
					tempcount++;
					
					System.out.println(temp[i]);
				}
			}
			//int uniq;
			//uniq=n-tempcount;
			System.out.println("Number of repeated characters: "+tempcount);
			int uniq;
			uniq=n-tempcount-zcount;
			System.out.println("Number of unique characters: "+ uniq);
			
			
			
		}

}
