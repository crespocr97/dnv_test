package test1.dnv_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
try {
			
			/*go to url */
			driver.get("https://www.dnv.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			/*accept cookies*/
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			Thread.sleep(1000);
			
			/*Global*/
			WebElement global=driver.findElement(By.xpath("//header/section[1]/aside[1]/a[1]"));
			Thread.sleep(2000);
			global.click();
			Thread.sleep(1000);
			
			/*select Spain*/
			WebElement language=driver.findElement(By.xpath("//a[contains(text(),'Spain')]"));
			language.click();
			Thread.sleep(1000);
			
			/*accept cookies*/
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			Thread.sleep(2000);
			
			/*scroll*/
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,9000)", "");
			Thread.sleep(1000);
			
			/*Press button 'Propósito, visión y valores'*/
			WebElement vision=driver.findElement(By.xpath("//a[contains(text(),'Propósito, visión y valores')]"));
			vision.click();
			
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,900)", "");
			Thread.sleep(1000);
			
			/*download 'Código de conducta'*/
			WebElement code=driver.findElement(By.xpath("//body/section[@id='dnvgl']/div[1]/section[1]/section[1]/section[1]/a[1]/span[1]/i[1]"));
			code.click();
			Thread.sleep(1000);
			
			/*login*/
			WebElement sesion=driver.findElement(By.xpath("//header/section[1]/a[1]"));
			sesion.click();
			Thread.sleep(1000);
			
			/*enter user name*/
			WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
			user.sendKeys("test@gmail.com");
			Thread.sleep(1000);
			
			/*click continue*/
			driver.findElement(By.id("continue")).click();
			
			/*enter password*/
			driver.findElement(By.id("password")).sendKeys("prueba");
			Thread.sleep(1000);
			
			/*click continue*/
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			
	
			
		}catch(Exception e) { 	
			e.printStackTrace();
		}finally {
			driver.quit();
		}
  }
}
