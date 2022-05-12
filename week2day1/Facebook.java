package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//creating a new account
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Pavitha");
	driver.findElement(By.name("lastname")).sendKeys("maha");
	driver.findElement(By.name("reg_email__")).sendKeys("3062002pavitha@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("athivap");
	
	//for Selecting day
	WebElement dropdwn= driver.findElement(By.id("day"));
	Select drp=new Select(dropdwn);
	drp.selectByValue("30");
	
	//for Selecting month
	WebElement dropdwn1=driver.findElement(By.id("month"));
	Select drp1=new Select(dropdwn1);
	drp1.selectByValue("Jun");
	
	//for Selecting year
	WebElement dropdwn3=driver.findElement(By.id("year"));
	Select drp2=new Select(dropdwn3);
	drp2.selectByValue("2002");
	
	//for Selecting Gender
	driver.findElement(By.name("sex")).click();
	driver.findElement(By.name("websubmit")).click();
	
	
	
	
	

	}

}
