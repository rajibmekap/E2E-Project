package Academy;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Udemy Tutorial\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");	
		driver.findElement(By.className("red-arrow-btn")).click();
//Select se = new Select (driver.findElement(By.className("dropdownDiv")));
driver.findElement(By.linkText("Ahmedabad (AMD)")).click();		
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GAU'][contains(text(),'Guwahati (GAU)')]")).click();	
driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-week-end')]//a[@class='ui-state-default'][contains(text(),'30')]")).click();
//driver.findElement(By.id("divpaxinfo")).click();
//driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//System.out.println("driver.findElement(By.xpath(\"//span[@id='spanAudlt']\")).getText()");//
driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']")).click();
System.out.println(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//assert.assertTrue(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());




//driver.close();


		Object arr[] = new Object[3]; 
		arr[0] = "65478";
		arr[1] = "testing";
		arr[2] = "india";
		
		for (int i=1; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}  
		
		
		int i=10;
		int j=100;
		int k;
				
		if (i>j) {
			System.out.println("i is greater then j and i is" +  j );
			k=i+j;
			System.out.println(k);
		}
		
		else {
			System.out.println("j is greater then i and i is" + i );
			k=i-j;
			System.out.println(k);
		}
		
		
	}

}
