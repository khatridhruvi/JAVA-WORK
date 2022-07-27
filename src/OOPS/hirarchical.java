package OOPS;

class D{
	D(){
		System.out.println("This is defualt constructor");
	}
	public void classD(){
		System.out.println("This is class D");
	}
}

class E extends D{
	E()
	{
		System.out.println("Hello Zankhana");
	}
	public void classE(){
		System.out.println("This is class E");
	}
}

class F extends D{
	public void classF(){
		System.out.println("This is class F");
	}
}

public class hirarchical {
	public static void main(String[] args) {
		F f= new F();
		f.classD();
		f.classF();
		
		E e = new E();
		e.classD();
		e.classE();
	}
}
