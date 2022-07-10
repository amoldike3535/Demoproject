package impprogram;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,sum=0;    //123=1+2+3=6
		while(n>0);{
			sum=sum+n%10;
			n=n/10;
		}
	     System.out.println(sum);
	}
	
}


