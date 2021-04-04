package Academy;

public class Static1 {

	static int student = 0;
	
	static {
		System.out.println("This is static block");
	}
	
	public Static1() {
		student++;
		System.out.println(student);
				
	}
	
	public static void main(String[] args) {
		Static1 ram = new Static1();
		Static1 shyam = new Static1();
		Static1.computer();
		
	}

	public void mechanical() {
		System.out.println("I am a mechanical student");
		System.out.println(student);
	}
	
	public static void computer() {
		System.out.println("I am a computer student");
		
	}
	
	
}
