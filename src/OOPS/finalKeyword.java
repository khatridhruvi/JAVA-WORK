package OOPS;

class emp{
	final int id = 1;
	String name;
	final public void show() {
		System.out.println("ID:-"+id);
	}
}

class empcall extends emp{
	/*public void show() {
		System.out.println("Show inside call");
	}*/
}

public class finalKeyword {
	public static void main(String[] args) {
		emp e = new emp();
		e.show();
		
	}
}
