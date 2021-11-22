public class Y extends X{
	public void method1(){
		System.out.println("ini adalah Y");
	}
	public static void main(String args[]){
		X obj = new Y();
		obj.method2();
	}
}