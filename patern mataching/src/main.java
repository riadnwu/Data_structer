import java.util.*;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		char get[]=new char[100];
		 Scanner input=new Scanner(System.in);
		char match[]=new char[100];
		int n1,n2,loc=0,temp=0;
		System.out.println("Enter First String:");
       
		get= input.next().toCharArray();
		System.out.println("Enter Second String:");
	     match= input.next().toCharArray();
	    n1=get.length;
	    n2=match.length;
	    if(n1>=n2)
	    {
	    	
	    	for(int i=0;i<=(n1-n2);i++)
	    	{
	    		loc++;
	    		for(int j=0;j<n2;j++)
	    		{
	    			if(get[i+j]==match[j])
	    			{
	    			 	temp++;
	    			}
	    			
	    		}
	    		if(temp==n2)
	    		{
	    			break;
	    		}
	    		temp=0;
	    	}
	    }
	    if(temp==0)
	    {
	    	System.out.print("Sorry Patern Not Match !!");
	    }
	    else
	    {
	    	System.out.printf("Patern Match On Location :%d",loc);
	    }

	}

}
