package pack6;

public class Test2 extends Demo11 {
	
	public void m3() {
		m1();
		m2();
		System.out.println("i am non static m3");
	}

	public static void m4() {
		//m1();
		m2();
		System.out.println("i am static m4");
	}
	
	public static void main(String[] args) {
		
		//Demo11 d=new Demo11();
		//d.m1();
		/*Test2 t=new Test2();
		t.m1();
		m2();*/
		
	}

}
