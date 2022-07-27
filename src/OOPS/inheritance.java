package OOPS;
class A{
	
	A(){
		System.out.println("Default A constructor");
	}
	public void  first(){
		System.out.println("This is class A");
	}
}
class B extends A {
	public void second() {
		System.out.println("This is class B");
	}
}
class C extends B{
	public void third() {
		System.out.println("This is Class c");
	}
}
public class inheritance {
	public static void main(String[] args) {

		
		B b = new B();
		b.first();
		b.second();
		
		C c = new C();
		c.first();
		c.second();
		c.third();
	}
}
