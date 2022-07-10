package impprogram;

public class findthelargestandsmallestnumber {

	public static void main(String[] args) {
		//array of 10 numbers
		int number []= new int[] {23,44,75,48,52,61,33,21,13,10};
		//assign first elemment of any array to largest and smallest number
		int smallest=number[0];
		int largest=number[0];
		for(int i=1; i<number.length; i++) {
			if(number[i]>largest) largest=number[i];

			else if (number[i]<smallest) smallest=number[i];
			}
		System.out.println("largest number:    "+largest);
		System.out.println("smallest number:    "+smallest);
		}

	}


