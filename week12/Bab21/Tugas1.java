// import java.util.*;
// public class Tugas1{
// 	public static void main(String args[]){
// 		TreeMap<String, TreeMap<String, String>> island = new TreeMap();
// 		TreeMap<String, String> provinsi = new TreeMap();

// 		island.put("Sumatera", new TreeMap<String,String>());
// 		TreeMap<String, String> suma = island.get("Sumatera");
// 		suma.put("NAD","Banda Aceh");
// 		suma.put("Sumatera Utara","Medan");
// 		suma.put("Sumatera Barat","Padang");
// 		suma.put("Kepulauan Riau","Tanjung Pinang");
// 		suma.put("Riau","Pekan Baru");
// 		suma.put("Jambi","Jambi");
// 		suma.put("Sumatera selatan","Palembang");
// 		suma.put("Bangka Belitung","Pangkal Pinang");
// 		suma.put("Bengkulu","bengkulu");
// 		suma.put("Lampung","Bandar Lampung");
// 		System.out.println("Ibu kota provinsi yang ada di Sumatera : \n");
// 		System.out.println(toStringWrapper(island.get("Sumatera")));










// 	}
// }

import java.util.*;
public class Tugas1 {
	public static void main(String[] args){
		TreeMap<String, TreeMap<String, String>> pulau = new TreeMap();
		TreeMap<String, String> propinsi = new TreeMap();
		
		pulau.put("Sumatera", new TreeMap<String, String>());
		TreeMap<String, String> p1 = pulau.get("Sumatera");
		p1.put("NAD\t\t", "Banda Aceh");
		p1.put("Sumatera Utara", "Medan");
		p1.put("Sumatera Barat", "Padang");
		p1.put("Kepulauan Riau", "Tanjung Pinang");
		p1.put("Riau\t\t", "Pekan Baru");
		p1.put("Jambi\t\t", "Jambi");
		p1.put("Sumatera Selatan", "Palembang");
		p1.put("Bangka Belitung", "Pangkal Pinang");
		p1.put("Bengkulu\t", "Bengkulu");
		p1.put("Lampung\t", "Bandar Lampung");
		System.out.println("\nIbukota propinsi yang terdapat di Pulau Sumatera\t: ");
		System.out.println(toStringWrapper(pulau.get("Sumatera")));

		pulau.put("Jawa", new TreeMap<String, String>());
		TreeMap<String, String> p2 = pulau.get("Jawa");
		p2.put("DKI Jakarta", "Jakarta");
		p2.put("Jawa Barat", "Bandung");
		p2.put("Jawa Timur", "Surabaya");
		p2.put("Jawa Tengah", "Semarang");
		p2.put("DI Yogyakarta", "Yogyakarta");
		p2.put("Banten", "Serang");
		System.out.println("\nIbukota propinsi yang terdapat di Pulau Jawa\t\t: ");
		System.out.println(toStringWrapper(pulau.get("Jawa")));

		pulau.put("Sulawesi", new TreeMap<String, String>());
		TreeMap<String, String> p3 = pulau.get("Sulawesi");
		p3.put("Sulawesi Utara", "Manado");
		p3.put("Sulawesi Tengah", "Palu");
		p3.put("Sulawesi Barat", "Kota Mamuju");
		p3.put("Sulawesi Selatan", "Semarang");
		p3.put("Sulawesi Tenggara", "Makassar");
		p3.put("Gorontalo\t", "Gorontalo");
		System.out.println("\nIbukota propinsi yang terdapat di Pulau Sulawesi\t: ");
		System.out.println(toStringWrapper(pulau.get("Sulawesi")));

		System.out.println("\nIbukota propinsi yang berawalan 'S'\t\t\t: ");
		for(TreeMap<String, String> map : pulau.values()){
			SortedMap<String, String> list = map.tailMap("S");
			System.out.println(list.size() <= 0 ? ("") : toStringWrapper(list));
		}
	}
	private static String toStringWrapper(Object obj) {
		return (obj.toString().replace("{", "> ").replace("}", "").replace(", ", "\n> ").replace("=", "\t= "));
	}
}