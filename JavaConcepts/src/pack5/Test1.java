package pack5;

public class Test1 {
	
	public void m3() {
		Demo10  dd=new Demo10();
		dd.m1();
		Demo10.m2();
		System.out.println("i am non static m3");
	}

	public static void m4() {
		Demo10  dd=new Demo10();
		dd.m1();
		Demo10.m2();
		System.out.println("i am static m4");
	}
	
	public static void main(String[] args) {
		Demo10 d=new Demo10();
		d.m1();
		Demo10.m2();
		
		Test1 t=new Test1();
		t.m3();
		m4();
	}
}
