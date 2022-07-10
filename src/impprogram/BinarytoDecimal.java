package impprogram;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1010;
		int r,d=0,base=1;
		while(n>0) {
			r=n%10;
			d=(d)+(r*base);
			n=n/10;
			base=base*2;
		}
		System.out.println(d);

	}

}
