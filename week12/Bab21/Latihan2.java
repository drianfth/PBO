// import java.util.*;

// public class Latihan2{
// 	public static void main(String args[]){
// 		String kata;

// 		Scanner input = new Scanner(System.in);
// 		System.out.print("Input : ");
// 		kata = input.nextLine();

// 		System.out.println("Output : ");
// 		TreeMap<String,Integer> word = new TreeMap();
// 		for(String y : kata.split(" ")){
// 			if(word.containsKey(y)){
// 				word.put(y,word.get(y).intValue()+1);
// 			}else{
// 				word.put(y,1);
// 			}
// 			class Latihan2Comparator implements Comparator<Map.Entry<String,Integer>>{
// 				@Override
// 				public int compare(Map.Entry<String,Integer>t, Map.Entry<String, Integer>t1){
// 					return t.getValue().compareTo(t1.getValue());
// 				}
				
// 			}
// 		} 

// 		System.out.println("Nilai tertinggi\t"+Collections.max(word.entrySet(),new Latihan2Comparator()));
// 		System.out.println("Nilai terendah\t"+Collections.min(word.entrySet(),new Latihan2Comparator()));

// 		System.out.println("Kata berawalan m : "+word.tailMap("m"));


// 	}
// }

import java.util.*;
import java.util.Scanner;
// import java.util.TreeMap;

public class Latihan2 {
	public static void main(String[] args) {
		String objek1;
		Scanner kata = new Scanner(System.in);
		System.out.println("Input : ");
		objek1 = kata.nextLine();

		System.out.println("Output : ");
		TreeMap<String,Integer>urut = new TreeMap<>();
		for(String objek2 : objek1.split(" ")) {
			if(urut.containsKey(objek2)) {
				urut.put(objek2,urut.get(objek2).intValue()+1);
			}
			else
				urut.put(objek2,1);
		}
		class Latihan7Comparator implements Comparator<Map.Entry<String,Integer>>{
			@Override
			public int compare(Map.Entry<String,Integer>aa,Map.Entry<String,Integer>bb) {
				return aa.getValue().compareTo(bb.getValue());
			}
		}
		System.out.println("Nilai Terendah : "+ Collections.min(urut.entrySet(),new Latihan7Comparator()));
		System.out.println("Nilai Tertinggi : "+ Collections.max(urut.entrySet(),new Latihan7Comparator()));
		System.out.println("Dengan Awalan M adalah : "+urut.tailMap("m"));
	}
}