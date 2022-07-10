package impprogram;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {

     int a,b;
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter value in a: ");
     a=Sc.nextInt();
     System.out.println("Enter values in b: ");
     b=Sc.nextInt();
     a=a+b;
     a=a-b;
     b=a-b;
     System.out.println("Vaules in a: "+a);
     System.out.println("Vuales in b: "+b);
     
	}

}
