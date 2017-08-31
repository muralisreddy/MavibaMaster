package pack4;

public class Demo7 {
	
	public void m1() {
		
	System.out.println("Hello m1");
	}
	
	public static void m2() {
		System.out.println("Hello m2");
	}

	public static void main(String[] args) {
		Demo7 d=new Demo7();
		d.m1();
		m2();
		System.out.println(12+78);
	}

}
