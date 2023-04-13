  package pages;

		
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.WebTestBase;

		public class LoginPage extends WebTestBase { 	
			@FindBy(id = "luser")     
			WebElement mobileTextBox;  	   
			@FindBy(id = "password") 	   
			WebElement passwordTextBox;
			
			@FindBy(xpath="//*[@class='btn btn-green signin-button']")	 
			WebElement loginbtn;
			
			@FindBy(xpath="	//*[@id='header_2']")
			WebElement hover;
			
			public LoginPage(){ 	       
				PageFactory.initElements(driver, this); 	  
				} 
				  
			public void login(String username, String password){ 	
				mobileTextBox.sendKeys(username); 	       
				passwordTextBox.sendKeys(password); 
				
				loginbtn.click(); 	    
			}
		public void mouseHover() {
			mouseHover(driver,hover);
		}
		@SuppressWarnings("unused")
		public void mouseHover(WebDriver driver, WebElement element){      
			   Actions action=new Actions(driver);
			    action.moveToElement(element)
			            .build()
			            .perform();
			    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			}
		// TODO Auto-generated method stub
			 

		     
		    
		}
	


