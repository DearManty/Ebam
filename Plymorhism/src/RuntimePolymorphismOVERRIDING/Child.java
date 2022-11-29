package RuntimePolymorphismOVERRIDING;

public class Child extends Parent {

public static void main(String[]args) {
	Child c=new Child ();
	c.m1();
	Parent p=new Parent();
	p.m1();
	Parent p1=new Child();
	p1.m1();
}

	public void m1() {
		
		System.out.println("kajol is sweet");
	}
}
