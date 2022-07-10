package impprogram;

import java.util.Scanner;

public class arms_strongerenumber {

	public static void main(String[] args) {
		int arm =0,a,b,c,d,no;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number: ");
		no=s.nextInt();
		d=no;
		while(no>0) {
			a=no%10;
			no=no/10;
			arm=arm+a*a*a;
		}
		if(arm==d) {
			System.out.println("arm Stronge number");
		}else {
			System.out.println("not arms strong number");
		}
	}

}
