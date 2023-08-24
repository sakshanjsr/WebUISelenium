package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClass {

	public static WebDriver driver;
	public static Properties props;
	
	
	
	public static WebDriver initializeDriver() throws IOException {
		
//>>>>>>>Get the Environment detail from the MAVEN mvn test
		String environment = System.getProperty("environment");
		//String environment = "Q2";
		System.out.println("Environment Selected : "+environment);

//>>>>>>>>> Load the property file after getting the env details from above
		try {
		props = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\global_"+environment+".properties");
		props.load(file);
		}catch (Exception e) {
			throw new RuntimeException("ENVIRONMENT NOT FOUND");
		}
		
		
//>>>>>>>>>>>>> the driver is ready to be initialized
		String browser = props.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {
			System.out.println("No Matched Driver");
		}

//>>>>>>>>>>> Maximize the window
		driver.manage().window().maximize();
		
//>>>>>>>>>>> Provide implicit wait on global level
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		return driver;
	
	}
	
	
		

}
