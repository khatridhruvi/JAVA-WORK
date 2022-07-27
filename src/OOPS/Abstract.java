package OOPS;

abstract class RBI{
	abstract public void intrest();
	abstract public void HL();
	public void reporate() {
		System.out.println(" reporate is +-4%");
	}
}

class SBI extends RBI{

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		System.out.println("SBI intrest : 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL intrest: 7%");
	}
	
}

class PNB extends RBI{

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		System.out.println("PNB intrest: 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("PNB HL intrest: 7%");
	}
	
}

class JAVA extends RBI{

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		System.out.println("JAVA intrest: 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL intrest: 8%");
	}
	
}
public class Abstract {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.intrest();
		s.HL();
		s.reporate();
		PNB p = new PNB();
		p.intrest();
		p.HL();
		p.reporate();
		JAVA j = new JAVA();
		j.intrest();
		j.HL();
		j.reporate();
	}
}
