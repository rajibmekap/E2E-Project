package Academy.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepage extends Base{
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initializedriver();
		driver.get("http://qaclickacademy.com");
				
		
	}
	

}
