import java.util.*;
public class riad {


	public static void main(String[] args) {
	double max;
	int n,location=0;
	double[] number=new double[100];
	Scanner input=new Scanner(System.in);
	System.out.printf("how many number:");
	n=input.nextInt();
	for(int i=0;i<n ;i++)
	{   
		System.out.printf("%d number:",i+1);
		number[i]=input.nextDouble();
	}
	max=number[0];
	for(int i=0;i<n ;i++)
	{   
		
		if(max<number[i])
		{
			max=number[i];
			location=i;
		}
		
	}
	System.out.printf("max number:%.2f\nlocation of max number:%d nb array",max,location);
	}

}
