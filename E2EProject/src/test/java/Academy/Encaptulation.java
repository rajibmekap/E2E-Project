package Academy;

public class Encaptulation {

	int length;
	int breath;
	
	Encaptulation() {
		
		length = 10;
		breath = 20;
		System.out.println("THis is a constructor");}
		
		Encaptulation(int M, int N) {
			
			length = M;
			breath = N;
			System.out.println("THis is a jenny constructor");
	}

public int Calculate() {
			return ( length*breath) ;
		}

public static int benny( int z, int y) {
	return ( z*y) ;
}

public static double benny( double z, double y) {
	return ( z*y) ;
}
		
}
