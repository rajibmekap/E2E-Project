package Academy;

public class PractiseJava1 {
	
	int sixth;
	int fifth;
	static int totalstudent=0;
	
	public PractiseJava1() {
		totalstudent++;
	} 

	public static int getstudent() {
		return totalstudent;
		
	}
	
	public int getsixth() {
		return sixth;
	}

	public void setA(int a) {
		sixth = a;
	}

	public int getfifth() {
		return fifth;
	}

	public void setB(int b) {
		fifth = b;
	}

	
	public static void main(String[] args) {
		
	
		
		String str = ("Jenny is a girl ninja");
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf("n"));
		
		System.out.println(str.charAt(4));
		
		System.out.println(str.indexOf('n', str.indexOf('n')+1));
		
			
		/*int number[] = {-21, 100, 212, 54, -32, 98};
		int largest = number[0];
		int smallest= number[0];
		
		for (int i=1; i<number.length; i++) {
			if (number[i]>largest){
				largest = number[i];
			}
			
			else if (number[i]<smallest) {
				smallest = number[i];
			}
		
		}
		
		System.out.println(largest);
		System.out.println(smallest);*/

	}

	
	
}
