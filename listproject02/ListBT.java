package listproject02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListBT {
	
	WebDriver driver;

	
	@BeforeMethod

	public void openBrowser() {
	System.setProperty("webdriver.driver.chrome", "");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}
	
	
	@Test
	public void test1() {
		String[] x = { "fdh", "dfgdg" , "dgfg" };
		ArrayList<String> ac = actValue(driver.findElements(By.xpath("")));
		ArrayList<String> ex = exValue(x);
		compareTextValue(ex, ac);
		
	}
	
	public void compareTextValue(ArrayList<String> exValue, ArrayList<String> actValue) {
		Iterator<String> e=exValue.iterator();
		Iterator<String> a=actValue.iterator();
		while(e.hasNext()&&a.hasNext()) {
			Assert.assertTrue(e.next().equals(a.next()));
		}
	}
	
	
	public ArrayList<String> exValue(String [] ex) {
		ArrayList<String> ar = new ArrayList<>();
		for(String x:ex) {
			ar.add(x);
		}
		return ar;
		
	}

    public ArrayList<String> actValue(List<WebElement> elements) {
		  
		  ArrayList<String> ar=new ArrayList<>();
		  for(WebElement element:elements) {
			  String value=element.getText();
			  ar.add(value);
		  }
		  
		  return ar;
	}
}
