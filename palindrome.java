import java.util.*;
public class palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,flag,n1,n2;
System.out.print("Enter the limits: ");
n1=sc.nextInt();
n2=sc.nextInt();
for(n=n1;n<n2;n++)
{
flag=0;
for(i=2;i<n/2;i++)
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
}