public class Latihan2 {
	public static void main (String args[]){
		byte b = 127;
		short s = b;
		char c = 'z';
		int i1 = s;
		int i2 = c;
		long l1 = i1;
		long l2 = i2;
		float f1 = l1;
		float f2 = l2;
		double d1 = f1;	
		double d2 = f2;		
		System.out.println("DARI BYTE ke DOUBLE\nbyte = "+ b + "\nsmall = "+ s + "\nint = "+ i1 + "\nlong =" + l1 + "\nfloat = " + f1 + "\ndouble = " + d1);
		System.out.println("DARI CHAR ke DOUBLE\nchar = "+ c + "\nint = "+ i2 + "\nlong =" + l2 + "\nfloat = " + f2 + "\ndouble = " + d2);
	}
}
