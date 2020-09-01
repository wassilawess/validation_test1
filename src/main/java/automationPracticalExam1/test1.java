package automationPracticalExam1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

@Test
	public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 
	 driver.get("http://techfios.com/test/101/");
	
	 driver.manage().window().maximize();	

	 driver.findElement(By.name("allbox")).click();

	  boolean isChecked;
	 // WebElement e = null;
	  
	 WebElement e = driver.findElement(By.name("allbox"));
			 //e.findElement(By.name("allbox"));
	 
	 Object attribute = e.getAttribute("checked");

	  
	  //isChecked = e.findElement(By.name("allbox")).isSelected();
	  isChecked = e.findElement(By.xpath("/html/body/div[3]/input[3]")).isSelected();
	  
	 // isChecked = e.findElement(By.name("allbox")).getAttribute("checked").equals("true");

	  System.out.println("out put is : " + isChecked);
	
	  Thread.sleep(2000);
	  
	  
	  driver.close();
	  driver.quit();
	}

}
