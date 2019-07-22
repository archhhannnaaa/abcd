package abc.abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Packagee {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@Given("I want to type the url")
	public void i_want_to_type_the_url() {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\ARCHANA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.40.4:8083/TestMeApp1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	System.out.println("opened");
	driver.findElement(By.linkText("SignUp")).click();
		}

	

@Then("I enter the username")
public void i_enter_the_username() {
	 
		driver.findElement(By.id("userName")).sendKeys("asdfgjgfklrt");
	   
	}

@Then("enter the First Name")
public void enter_the_First_Name() {

	driver.findElement(By.id("firstName")).sendKeys("aetjhf");
  
}
@Then("enter the Last Name")
public void enter_the_Last_Name() {

	driver.findElement(By.id("lastName")).sendKeys("nrgdfs");
    
}
@Then("enter the Password")
public void enter_the_Password() {
	driver.findElement(By.id("password")).sendKeys("qamamani98");
	   
   
}
@Then("enter the Confirm Password")
public void enter_the_Confirm_Password() {
	driver.findElement(By.name("confirmPassword")).sendKeys("qamamani98");
   
}



	@Then("choose the Gender")
	public void choose_the_Gender() {
	driver.findElement(By.xpath("//span[text()='Female']")).click();
	    
	}

	@Then("I Enter the E-mail")
	public void i_Enter_the_E_mail() {
		driver.findElement(By.name("emailAddress")).sendKeys("naarrchana348@gmail.com");
	   
	}

	@Then("I enter the Mobile Number")
	public void i_enter_the_Mobile_Number() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("mobileNumber")).sendKeys("9345378771");
	  
	}

	@Then("I enter DOB")
	public void i_enter_DOB() {
		driver.findElement(By.name("dob")).sendKeys("25/09/1997");  
	   
	}

	@Then("I enter the Address")
	public void i_enter_the_Address() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys("meenambakkam");  
	  
	}

	@Then("I choose the Security Question")
	public void i_choose_the_Security_Question() {
	   Select a=new Select(driver.findElement(By.name("securityQuestion")));
	   a.selectByVisibleText("What is your favour color?");
	  
	}

	@Then("I enter the Answer")
	public void i_enter_the_Answer() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("answer")).sendKeys("blue");  
		
	  
	}

	@Then("I click on Register")
	public void i_click_on_Register() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//input[@value='Register']")).click();
	    
	}


}
