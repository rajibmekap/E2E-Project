package Academy;

public class Arraychild extends Array{
	
	String name = "Benny";
	
	public void child() {
		
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		Arraychild CD = new Arraychild();
		CD.child();
		CD.test();
		
	}

}
