package firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium  {

	public static void main(String[] args){
		
        System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/"
        		+ "project2/chromedriver");
        WebDriver driver=new ChromeDriver();  

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.target.com/");
        String s = driver.getTitle();
        System.out.println(s);
        
        driver.close();

          
       

	}

}
