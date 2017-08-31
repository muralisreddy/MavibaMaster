package pack4;

public class Demo8 {
	
	
	public void m1() {
		System.out.println("non static m1");
	}
	
	
	public void m2() {
		m1();
		System.out.println("non static m2");
		m3();
	}
	
	
	public static void m3() {
		System.out.println("static m3");
	}
	
	public static void main(String[] args) {
		Demo8 d=new Demo8();
		//d.m1();
		d.m2();
		
	}

}
