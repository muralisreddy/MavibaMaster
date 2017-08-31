package pack4;

public class Demo9 {
	
	public void m1() {
		System.out.println("non static m1");
	}
	
	
	public static void m2() {
		System.out.println(" static m2");
	}
	
	
	public static void m3() {
		Demo9 d=new Demo9();
		d.m1();
		m2();
		System.out.println("static m3");
	}
	
	public static void main(String[] args) {
		m3();
	}

}
