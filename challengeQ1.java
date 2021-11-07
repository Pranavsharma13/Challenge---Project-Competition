// Q1
import java.util.*;
public class challengeQ1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Size : ");
	    int n=sc.nextInt();
	    int count=0;
	    int a[]=new int[n];
	    System.out.println("Elements : ");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
            for(int i=0;i<n-1;i++)
	        {
	            if(a[i+1]<a[i])
	            {
	                ++count;
	            }
	        }
            System.out.println(" "+count);
    }

}