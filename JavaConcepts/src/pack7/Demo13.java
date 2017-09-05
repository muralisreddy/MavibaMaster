package pack7;

public class Demo13 {

	
	int a=1000;// declaration and non static or instance or global
	public static int b = 10;// initialization and class or static variable
	public String name = "java";//default, public , private , protected(access modifier)
	
	
	public void add() {
		
		//e is a local variable
		//static int c=100; as declaration or initialization we can't define static variable inside the method
		//int e; can't define declaration variable inside the method.
		int e=100;
		int a=11;
		System.out.println(a+b+e);
	}

	public static void mul() {
		Demo12 d=new Demo12();
		//d.add();
		System.out.println(d.a*b);
	}
	
	public static void main(String[] args) {
		Demo13 d=new Demo13();
		d.add();
	}
}
