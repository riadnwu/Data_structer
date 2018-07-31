import java.io.InputStream;
import java.util.Scanner;


public class quicksort1 {
private static int n,pi,beg,end,swp,temp=0;
private static int data[]=new int[100];
private static int left[]=new int[100];
private static int right[]=new int[100];

 public void get_data()
 {
	 Scanner input =new Scanner(System.in);
	 System.out.println("How many number :");
	 n=input.nextInt();
	 for(int i=0;i<n;i++)
	 {
		 System.out.printf("Enter your %d number :",i+1); 
		 data[i]=input.nextInt();
	 }
 }
 public void show_data()
 {
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(data[i]+" "); 
	 }
 }
 public void sub_main()
 {  
	 System.out.println("  Quick Sort   ");
	 get_data();
	 show_data();
	 if(n>1)
	 {
		 left[temp]=0;
		 right[temp]=n-1; 
	 }
	
	 while(temp!=-1)
	 {
		  beg=left[temp];
          end=right[temp];
          temp--;
     sort();
	 if(beg < pi-1)
	 {
		 temp++;
		 left[temp]=beg;
		 right[temp]=pi-1;
	 }
	 if(end >  pi+1)
	 {
		 temp++;
		 left[temp]=pi+1;
		 right[temp]=end;
	 }
	 
	 }
	
 }
 public static void sort()
 {
	 while(data[pi] <= data [end]&& pi != end)
	 {
		end--;
	 }
	 if(pi==end)
	 {
		 return;
	 }
	 if(data[pi] > data [end])
	 {
		swp=data[pi];
		data[pi]=data[end];
		data[end]=swp;
		pi=end;		
	 }
	 while(data[pi] >= data [beg]&& pi != beg)
	 {
		beg--;
	 }
	 if(pi==beg)
	 {
		 return;
	 }
	 if(data[pi]< data [beg])
	 {
		swp=data[pi];
		data[pi]=data[beg];
		data[beg]=swp;
		pi=beg;		
	 }
	 
 }
}



