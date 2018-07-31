import java.util.Scanner;
public class main1 {

	
	public static void main(String[] args) {
          int k=1,loc=0,n;
          double item;
          double[] arr=new double[100];
          System.out.printf("How Many Number:");
          Scanner input=new Scanner(System.in);
          n= input.nextInt();
          for(k=1;k<=n;k++)
          {
        	  System.out.printf("Enter %d Number:",k);
        	  arr[k]=input .nextDouble();
        	  
          }
          System.out .printf("Enter Your Finding Number:");
          item=input .nextDouble();
          for(k=1;k<=n;k++)
          {
        	  if(item==arr[k])
        	  {
        		  loc=k;
        		  System.out .printf("%.2f Number Is Found And Location Of The Number Is %d",item,loc);
        	  }
          }
          if (loc==0)
          {
        	  System.out.print("Item Is Not In The Arra");
          
          }
          
	}

}
