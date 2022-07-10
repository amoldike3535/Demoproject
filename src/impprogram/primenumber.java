package impprogram;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
     int no, i, fect=1;
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter any  number:  ");
     no=Sc.nextInt();
     if(no==1) {
    	 System.out.println("smallest prime number is 2");
     }
	
     for(i=2; i<no; i++) {
     }
     if(no%i==0) {
    	 System.out.println("not prime");
    	
     }
	  if(no==i) {
		  System.out.println("prime");
	  }

}}