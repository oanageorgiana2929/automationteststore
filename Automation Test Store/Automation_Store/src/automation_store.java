import org.openqa.selenium.chrome.ChromeDriver;

public class automation_store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://automationteststore.com/");
	}

}
