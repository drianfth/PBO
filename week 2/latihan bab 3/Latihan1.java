public class Latihan1 {
	public static void main (String args[]){
		double d = 123.45;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		char c = (char) i;
		short s = (short) i;
		byte b = (byte) s;
				

		System.out.println("Double : "+ d +" => Float : "+ f);
		System.out.println("Float : "+ f +" => Long : "+ l);
		System.out.println("Long : "+ l +" => int : "+ i);
		System.out.println("Int : "+ i +" => Char : "+ c);
		System.out.println("Int : "+ i +" => Short : "+ s);
		System.out.println("short : "+ s +" => Byte : "+ b);





	}
}
