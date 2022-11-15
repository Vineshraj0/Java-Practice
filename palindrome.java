import java.util.*;

public static palindrome{
public static void mian(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,flag;
System.out.print("Enter a number: ");
n=sc.nextInt();
flag=0;
for(i=0;i<n/2;i++)
{
	if(n%i==0)
	{
		flag=1;
		break;
	}
	
		
		
}

if(flag==0)
	System.out.println(n);


}
}