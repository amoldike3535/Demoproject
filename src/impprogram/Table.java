package impprogram;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:  ");
		n=s.nextInt();
		for(i=1; i<=10; ++i)
			System.out.println(n+" * "+i+" = "+(n*i));
		

	}

}
