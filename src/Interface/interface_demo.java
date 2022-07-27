package Interface;

class intercall implements interface_1,interface_2{

	@Override
	public void interface2() {
		System.out.println("Interface_2");
	}

	@Override
	public void interface1() {
		System.out.println("Interface_1");
	}

	@Override
	public void interface3() {
		System.out.println("Interface_3");
	}
	
}

public class interface_demo {
	public static void main(String[] args) {
		intercall i = new intercall();
		i.interface1();
		i.interface2();
		i.interface3();
		interface_1.interface4();
	}
}
