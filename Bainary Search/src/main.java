import java.util.*;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       int mid,item,beg,end,n,loc=0;
       int arr[]=new int[100];
       Scanner input=new Scanner(System.in);
       System.out.printf("How Many Number :");
       n=input.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   System.out.printf("Enter %d Numdber:",i);
    	   arr[i]=input.nextInt();
       }
       System.out.printf("Enter Your Search Number:");
       item=input.nextInt();
       beg=1;
       end=n;
       do
       {
    	   mid=(beg+end)/2;
    	   if(item > arr[mid])
    	   {
    		   beg=mid+1;
    		   
    	   }
    	   
    	   else
    	   {
    		   end=mid-1;
    	   }
       }
       while(item != arr[mid]&& beg<=end);
     if (item==arr[mid])
     {
    	 loc=mid;
    	 System.out.printf("The location Of Item %d Is :%d",item,loc);
     }
     else
     {
    	 System.out.print("Sorry Item Does Not Found !!");
     }
       
	}

}
