import java.util.Scanner;


public class quick_sort  {

	public static void main(String[] args) {
		int n;
	    int loc;
	    int beg,end;
	    int temp=0;
	    int arr[]=new int[100];
		int left[]=new int[100];
		int right[]=new int[100];
		quick obj =new quick();
		Scanner input = new Scanner(System.in);
      System.out.printf("Quick Sort");
      System.out.println("How Many Number:");
      n=input.nextInt();
      for(int i=0;i<n;i++)
      {
    	  System.out.printf("Enter Your %d Number:",i);
    	  arr[i]=input.nextInt();
    	  
      }
      
      if(n>1)
      {
         left[temp]=0;
         right[temp]=n-1;
      }
      while (temp !=-1)
      {
          beg=loc=left[temp];
          end=right[temp];
          temp--;

        obj.quick1(beg,end,loc,arr) ;
          if(beg<loc-1)
          {
             temp++;
             left[temp]=beg;
             right[temp]=loc-1;
          }
           if(end > loc+1)
          {
             temp++;
             left[temp]=loc+1;
             right[temp]=end;
          }
      }
      for(int i=0;i<n;i++)
      {
    	  System.out.printf(" %d ",arr[i]);
    	  
      }
      
	}

}
