package impprogram;

public class Palindromusingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="madam";
		String rev=" ";
		int length=ss.length();
		for(int i=length-1;i>0; i--) {
			rev=rev+ss.charAt(i);
		}
		System.out.println(rev);
		if(ss.equals(rev)) {
			System.out.println("palindrom number");
		}else {
			System.out.println("palindrom number");
		}

	}

}
