package impprogram;

import java.util.Scanner;

public class countnumberofspacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		String n;
		System.out.println("enter number of String");
		Scanner ab=new Scanner(System.in);
		n=ab.nextLine();
		char ch[]=n.toCharArray();
		int letters=0, spaces=0,numbers=0,others=0;
		for(int i=0; i<n.length(); i++) {
			if(Character.isJavaLetter(ch[i])) {
				letters++;	
			}
			else if(Character.isSpaceChar(ch[i])) {
				spaces++;
			}else if(Character.isDigit(ch[i])) {
				numbers++;
			}
			else {
				others++;
			}
			System.out.println(n);
			System.out.println("tetters" +" "+letters);
			System.out.println("spaces"+" "+spaces);
			System.out.println("number"+" "+numbers);
			System.out.println("others"+" "+others);
				
			}
		}

	}


