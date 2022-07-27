package OOPS;

class Overriding{
	public void show() {
		System.out.println("overriding class");
	}
}
class Call extends Overriding{
	public void show() {
		System.out.println("call class");
		//super.show();
	}
}
public class runtime {
	public static void main(String[] args) {
		Call c = new Call();
		c.show();
	}
}
