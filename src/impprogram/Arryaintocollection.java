package impprogram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Arryaintocollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array input
		String PlayersArray[]
				={"ravi","amol","tushar","sagar"};
		//printing input elements for comparision
		System.out.println("Arrya input: "+ Arrays.toString(PlayersArray));
		//converting array into collection
		//with as list() function 
		Collection<String> PlayersList = Arrays.asList(PlayersArray);
		//print converted elements
		System.out.println("Converted elements:  "+PlayersList);

	}

}
