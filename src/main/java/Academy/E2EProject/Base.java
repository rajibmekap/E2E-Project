package Academy.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;

public WebDriver initializedriver () throws IOException
{
	Properties prop = new Properties();
	FileInputStream fis  = new FileInputStream("C:\\Users\\rajib\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\E2EProject\\Data.properties");
prop.load(fis);


String browsername = prop.getProperty("browser");

 if (browsername.equals("chrome"))
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
else if (browsername.equals("IE"))
{
	System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
driver = new InternetExplorerDriver();
	
}

else if (browsername.equals("firefox"))
{
	
	System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
}

 return driver;
}
}
