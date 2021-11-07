// Q3
import java.util.*;
public class challengeQ3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String s1=s.trim();     // to ignore the space after the last word if any
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
		    if(s1.charAt(i)==' ')
		    {
		        count =0;       //to reset the counter to 0 and move to the next word.
		    }
            else
            {
                count++;
            }
		}
		
		System.out.println(" "+count);
	}
}

