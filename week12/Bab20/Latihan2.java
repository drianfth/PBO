import java.util.*;
import static java.util.Collections.reverse;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;

public class Latihan2{
	public static void main(String args[]){
		List list = new ArrayList();
		list.add("Andrian");
		list.add("Fathulloh");
		list.add("Yoga");
		list.add("Bagaskara");
		list.add("Edo");

		System.out.println("List : " + list);
		reverse(list);
		System.out.println("List Terbalik : " + list);
		shuffle(list);
		System.out.println("List Acak : " + list);
		sort(list);
		System.out.println("List Terurut: " + list);

	}
}

