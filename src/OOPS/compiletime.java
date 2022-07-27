package OOPS;
// This is all about overloading concept 

// In overloading method name are same but the arguments are different
// overloading concept work in compile time

class Overloading{
	Overloading(){ // constructor are call by default in overloading 
		System.out.println("Hello world");
	}
	Overloading(String name){
		System.out.println("Name is :-"+name);
	}
	Overloading(int i){
		System.out.println( "number is :-"+i);
	}
	public void show(int i) {
		System.out.println("hello show method 1 ");
	}
	public void show(int i,int j) {
		System.out.println("hello show method 2");
	}
}
public class compiletime {
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.show(2);
		o.show(1, 2);
		
		Overloading o1= new Overloading("Dhruvi");
		Overloading o2 = new Overloading(1);
	}
}
