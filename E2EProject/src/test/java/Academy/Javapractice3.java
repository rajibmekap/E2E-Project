package Academy;

import javax.swing.Spring;

import org.testng.annotations.Test;

public class Javapractice3 {	

	static String k = "hello india";
	
	public static void main(String[] args) {
		
		PractiseJava1 child = new PractiseJava1();
     child.setA(50);
     child.setB(20);
		
		System.out.println(child.getsixth() + child.getfifth());
		
		int i[] = {60, 20, 10, 60, 70};
				
		/*for (int j=0; j<=i.length; j++)  {
		  System.out.println(i[j]);
	}
		for (int element : i) {
			System.out.println(element);
			
		}	*/
		
		int m = k.length();
		System.out.println(k.replace('i', 'o'));
		
		laptop("rajib");
        int sum = Inge(5, 6);
		
		}
	
		public static void laptop(String name) {
		
		System.out.println(name);
	}

	public static int Inge(int a, int b) {
		
		return (a+b);
	}

	
	
}
	

