package Academy;

public class PractiseJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Encaptulation constructor = new Encaptulation (5, 6);
		System.out.println(constructor.Calculate());
		
		Encaptulation constructor1 = new Encaptulation ();
		System.out.println(constructor1.Calculate());
		
		String s = "rajib";
		int p = s.length();
		String k = "";
		
		
		
		for (int i =p-1; i>=0; i--) 
		{
			k = k + s.charAt(i);
			
		}
		System.out.println(k);
		
		
		/*int c[] = {2, 6, 9, 7, 1};
		for (int i=0; i<c.length; i++)
			
		{
			System.out.println(c[i]);
			
		}*/
		
		/* String s = "selenium";
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse()); */
		
		
		
		
	}

}
