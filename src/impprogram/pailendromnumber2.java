package impprogram;

import java.util.Scanner;

public class pailendromnumber2 {
   public static void main(String[] args) {
	   int a,no,b,temp=0;
	   Scanner s=new Scanner(System.in);	
	   System.out.println("enter any num: ");
	   no=s.nextInt();
	   b=no;
	   while(no>0) {
		   a=no%10;
		   no=no/10;
		   temp=temp*10+a;
	   }
	   if(temp==b) {
		   System.out.println("pailendrome");
	   }else {
		   System.out.println("not pailendrome");
	   }
}
}
	

	  
	  

	 
	
