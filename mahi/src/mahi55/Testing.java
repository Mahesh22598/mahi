package mahi55;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\softy\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement name=driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("mahsh");
		WebElement place=driver.findElement(By.id("j_idt88:j_idt91"));
		place.sendKeys(" ","nagercoil"+Keys.ENTER);
		WebElement disable=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean ab=disable.isEnabled();
		System.out.println(ab);
		WebElement clear=driver.findElement(By.id("j_idt88:j_idt95"));
		clear.clear();
		WebElement click=driver.findElement(By.id("j_idt106:j_idt122"));
		click.click();
		WebElement add=driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a"));
		add.click();
		WebElement btn=driver.findElement(By.linkText("Button"));
		btn.click();
		WebElement clr=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
		String cor=clr.getCssValue("background-color");
		System.out.println(cor);
		WebElement size=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]"));
		Select xx=new Select(size);
		List <WebElement> xz= xx.getOptions();
		int mm=xz.size();
		System.out.println(mm);
		driver.quit();
		
		
		

	}
	
}
