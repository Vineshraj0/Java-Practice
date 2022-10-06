import java.util.*;


public class sales{
    public static void main(String args[])
    {
        
        
        int n,i,k=0;
        int[] temparr=new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        
        int j,temp;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int count=0;
        for(i=0;i<n;i++)
        {
            count=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0)
            {
            temparr[k]=count;
            k++;
            //System.out.println(arr[i]+"->"+count);
            }
        }
        int origcount=0;
        int rem,val;
        for(i=0;i<k;i++)
        {
            val=temparr[i]/2;
            {
                origcount=origcount+val;
            }
            
        }
        System.out.println(origcount);
    }
}
