

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	@Test(priority= 1,dataProvider = "asd")
	void m1(String m,String b)
	{
		System.out.println(m+""+b);
	}
	
	@Parameters({"Browser"})
	@Test(enabled=false,groups= {"ref"})
	void m0(String br)
	{
		System.out.println(br);
		System.out.println("0");
	}
	@Test(priority=2,dependsOnMethods= {"m1"},alwaysRun=true)
	void m()
	{
		
		System.out.println("m");
	}
	
	@DataProvider(name= "asd")
	String[][] m12()
	{
		
	String	c[][]= {{"32","23"},{"dsf","sdf"}};
	return c;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://OS (D)//Amol Practice//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById().value='amol'");
		
		js.executeScript("window.scrollBy(0,120)");
	
		
	

		
		

	}

}
