import java.util.*;

public class Latihan1{
	public static void main(String args[]){
		String kata;

		Scanner input = new Scanner(System.in);
		System.out.print("Input : ");
		kata = input.nextLine();

		System.out.println("Output : ");
		TreeMap<String,Integer> word = new TreeMap();
		for(String y : kata.split(" ")){
			if(word.containsKey(y)){
				word.put(y,word.get(y).intValue()+1);
			}else{
				word.put(y,1);
			}
		} 
		System.out.println(word);

	}
}