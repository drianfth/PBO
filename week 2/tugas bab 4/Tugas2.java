public class Tugas2 {
	static int Compare(int i,int j, int k){
		if (i < j && i < k) 
			return i;
		else if (j < i && j < k)
			return j;
		else if (k < i && k < j)
			return k;
		else
			return 0;
	}

	public static void main (String args[]){
		int a = 8,b = 7, c = 9;
		int d = 2,e = 3, f = 1;
		int g = 1,h = 3, i = 5;

		System.out.println("Input\t|\tOutput");
		System.out.println("----------------------");
		System.out.println(a + " " + b + " " + c +"\t|\t" + Compare(a,b,c));
		System.out.println(d + " " + e + " " + f +"\t|\t" + Compare(d,e,f));
		System.out.println(g + " " + h + " " + i +"\t|\t" + Compare(g,h,i));

	}
}