package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee {
	@Test(dataProvider="Res")
public void login(String s1,String s2,String s3,String s4) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\SkyExpress\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@type='text'][1]")).sendKeys(s1);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='text'][2]")).sendKeys(s2);
		d.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys(s3);
		d.findElement(By.xpath("//input[@type='email']")).sendKeys(s4);
		d.quit();
	}
		@DataProvider(name="Res")
		public Object[][] data(){
			return new Object[][] {{"saranya","sara","kelmbakam","usaran@gmail.com"},{"Raga","sudha","chennai","raga@gmail.com"},{"pandi","dora","padur","pandi@gail.com"}};
			
		}
			
		}
		
		
		
		
		
		



