package Academy;

public class Array {
	
	String name = "Rajib";

	public Array() {
		
		System.out.println("I am Jenny");
		
	}

	public static void main(String[] args) {
		
 int a[][] = {{1, 6, 5},{ 7, 5, 3}};
 int min =a[0][0];

  for (int i=0; i<2; i++)
 {
	for (int j=0; j<3; j++)
	  {
		if (a[i][j] > min){
			min = a[i][j];
		
		}

	}

Array RR = new Array();
RR.test();
}
  System.out.println("My age is  " + min);

}


public void test() {
	Array array1 = new Array();
	System.out.println("I am parent class");
	
}


}