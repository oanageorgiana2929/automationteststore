import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://automationteststore.com/");
	       
	    WebElement ele = driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[4]/a"));
	    
	    Actions action = new Actions(driver);
	    
	    action.moveToElement(ele).perform();
	    
	    driver.findElement(By.linkText("Eyes")).click();
	    
	    boolean text = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]")).isDisplayed();
	    System.out.println(text);
	    
	    if(text)
	    {
	    	System.out.println("The text is here ");
	    }
	    else {
	    	System.out.println("Isn't here!");
	    }
	}
	
	

}
