import java.util.Scanner;
import java.lang.*;
public class riad {

	public static void main(String[] args) {
	double a,b,c,x1,x2,x,d;
	 Scanner input =new Scanner(System.in);  
	System.out.printf("a=");
	 a= input. nextInt();
	 System.out.printf("b=");
	 b= input. nextInt();
	 System.out.printf("c=");
	 c= input. nextInt();
	 d=(b*b)-(4*a*c);
	 if(d>0)
	 {
		x1=(-b+Math.sqrt(d))/(2*a) ;
		x2=(-b-Math.sqrt(d))/(2*a) ;
		System.out.printf("x1=%.2f\n",x1);
		System.out.printf("x1=%.2f",x2);
	 }
	 else if(d==0)
	 {
		 x=-b/(2*a);
		 System.out.printf("x=%.2f\n",x);
	 }

	 else
	 {
		 System.out.printf("No Real Solution");
	 }
		
	}

}
