package pack3;

public class Demo6 {
	
	
	//this is non static method, because of no static keyword in the method signature
	public void myDetails() {
		System.out.println("my name is xyz");
		System.out.println("my city is lmn");
	}
	
	//this is static method, because of  static keyword is having in the method signature
	public static void myFamilyDetails() {
		System.out.println("my father name is a");
		System.out.println("my mother name is b");
	}
	public void add() {
		System.out.println(11+22);
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	//jvm main method is always static method
	public static void main(String[] args) {
		myFamilyDetails();
		Demo6 d=new Demo6();
		d.myDetails();//static method won't allow non static method directly.
		d.add();
		d.add();
		d.add(1, 2);
		d.add(10, 20);
	}

}
