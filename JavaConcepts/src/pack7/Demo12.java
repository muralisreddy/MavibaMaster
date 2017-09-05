package pack7;

public class Demo12 {

	int a;// declaration and non static or instance or global
	public static int b = 10;// initialization and class or static variable
	public String name = "java";//default, public , private , protected(access modifier)
	
	
	public void add() {
		System.out.println(a+b);
	}

	public static void mul() {
		Demo12 d=new Demo12();
		//d.add();
		System.out.println(d.a*b);
	}
	
	public static void main(String[] args) {
		Demo12 dd=new Demo12();
		dd.add();
		mul();
	}
}
