package impprogram;

import java.util.Scanner;

public class Fibonaccipractice {

	public static void main(String[] args) {
	 int i,no, Frist=0, second=1, next;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter number of terms for series: ");
	 no=s.nextInt();
	 Frist=0;
	 second=1;
	 System.out.println("fibonacci series are:  ");
	 for(i=0; i<no; i++) {
		 System.out.println(Frist);
		 next =Frist+second;
		 Frist=second;
		 second=next;
	 }	 

	}

}
