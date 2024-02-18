package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.prothomalo.com/");	    
	    driver.manage().window().maximize();

	}

}
