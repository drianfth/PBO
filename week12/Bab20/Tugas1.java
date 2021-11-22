import java.util.*;
public class Tugas1{
	public static void main(String args[]){
		Object[] color = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
		Object[] deletedColor = {"RED","WHITE","BLUE"};
		List warna = new ArrayList();
		List warnaHapus = new ArrayList();
		warna.addAll(Arrays.asList(color));
		warnaHapus.addAll(Arrays.asList(deletedColor));
		System.out.println("Warna\t\t\t:"+warna);
		System.out.println("Warna yang dihapus\t:"+warnaHapus);
		warna.removeAll(warnaHapus);
		System.out.println("warna tersisa\t\t:"+warna);


	}
}