import java.util.Scanner;


public class Boubble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arra[]=new int[100];
        int swp,n,temp=0;
        Scanner input=new Scanner(System.in);
        System.out.print("How many number:");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.printf("Enter Your %d Number:",i);
        	arra[i]=input.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
        	System.out.printf("  %d  ",arra[i]);
        }System.out.printf("\n");
        for(int i=1;i<n;i++)
        {
        	for(int j=1;j<=(n-1);j++)
        	{
        		if(arra[j]>arra[j+1])
        		{
        			swp=arra[j];
        			arra[j]=arra[j+1];
        			arra[j+1]=swp;
        			temp=1;
        		}
        	}
        	  for(int j=1;j<=n;j++)
              {
              	System.out.printf("  %d  ",arra[j]);
              }System.out.printf( "\n");
        	if(temp==0)
        	{
        		break;
        	}
        	temp=0;
        }
        
	}

}
