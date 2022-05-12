package week2day3;

public class Browsercommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
