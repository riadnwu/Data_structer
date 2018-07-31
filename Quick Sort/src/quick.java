
public class quick {
	
	void  quick1(int beg ,int end,int loc,int arr[] )
	{   
		 boolean error=true;
	    int swp;
	    while (error=true)
	    {
	        while(arr[loc] <= arr [end] && loc != end)
	   {
	       end--;
	   }
	   if(loc==end)
	   {
	       return;
	   }
	   if(arr[loc] >arr [end])
	   {
	     swp =arr[loc];
	     arr[loc]=arr[end];
	     arr[end]=swp;
	     loc=end;
	   }
	     while(arr[loc] >= arr [beg] && loc != beg)
	   {
	       beg++;
	   }
	   if(loc==beg)
	   {
	       return;
	   }
	   if(arr[loc] < arr [beg])
	   {
	     swp =arr[loc];
	     arr[loc]=arr[beg];
	     arr[beg]=swp;
	     loc=beg;
	   }
	    }

	}
}
