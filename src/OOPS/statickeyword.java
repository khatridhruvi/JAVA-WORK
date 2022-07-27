//static keyword

package OOPS;

class stu{
	static {
		System.out.println("This is student static block");
	}
	int id;
	String name;
	
	static  String cname="Tops"; 
	public stu(int id,String name) {
		this.id = id;
		this.name=name;
	}
	
	public void getData() {
		System.out.println("id:-"+id);
		System.out.println("Name:-"+name);
		System.out.println("cname:-"+cname);
	}
	public static void run() {
		System.out.println("This is run method");
	}
}


public class statickeyword {

	static {
		System.out.println("This is main static block");
	}
	
	public static void main(String[] args) {
		stu s1=new stu(1,"dhruvi");
		stu s2 = new stu(2,"Zankhana");
		stu s3 = new stu(3,"khushi");
		
		s1.getData();
		s2.getData();
		s3.getData();
		s1.run();
		stu.run();
	}
}
