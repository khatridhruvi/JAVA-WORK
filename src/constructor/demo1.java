package constructor;
class Employee{
	int id;
	String name;
	Employee(){
		System.out.println("This is default constructor");
	}
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
		System.out.println("id = "+id);
		System.out.println("Name = "+name);
	}
	Employee(Employee e1){
		id= e1.id;
		name= e1.name;
	}
	public void run() {
		System.out.println("Id="+id+ "  name="+name);
	}
}
public class demo1 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.run();
		Employee e1 = new Employee(1,"Dhruvi");
		e1.run();
		Employee e2 = new Employee(e1);
		e2.run();
	}
}
