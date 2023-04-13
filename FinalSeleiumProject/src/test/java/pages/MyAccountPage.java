
		package pages;

		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		import testbase.WebTestBase;
		import utils.Utility;

		public class MyAccountPage extends WebTestBase { 	
			@FindBy(xpath = "//h1[text()='My Account']")     
			WebElement accountTitle;     
			@FindBy(xpath = "//input[@id='inputbar']")    
			WebElement searchTextBox;     
			@FindBy(id = "btnTopSearch")    
			WebElement searchBtn;      
			@FindBy(xpath = "//div[@class='search-summary search-heading']")     
			WebElement searchTitle;      
			@FindBy(xpath = "//select[@class='styled']") 
			WebElement dropDown;      
			@FindBy(xpath = "//span[@class='usernametext']")     
			WebElement hover;     
			@FindBy(xpath = " //*[@id=\"gfg-footer\"]/div[1]/div[1]/div[3]/a[3]/div")
			WebElement youtubeOption; 
			
			
			public MyAccountPage(){         
				PageFactory.initElements(driver, this);     
				} 	
			public String getTextOFMYAccountPage(){         
					return accountTitle.getText();     
					} 	
		/*	public void search(){       
				searchTextBox.click();        
				searchTextBox.sendKeys("Java");       
				searchTextBox.sendKeys(Keys.ENTER);         
				searchBtn.click();    
				} */
			public void selectDropDown(String term, String value){        
				dropDown.click();        
				Utility.selectValue(dropDown,term,value);     
				}     
			 
			public String getTextOfSearch(){        
				return searchTitle.getText();    
				}     
			public void scrollDownMethod() {         
				Utility.scrollDownByElement(driver, youtubeOption);         
				youtubeOption.click();     
				}     
			
			public void windowHandle(){         
				Utility.scrollDownByElement(driver,youtubeOption );       
				youtubeOption.click();        
				Utility.switchToWindows(driver);     
				//accountTitle
				}

			public void getCookiesHandle(){        
				Utility.getCookies();     
				} 
			
		// TODO Auto-generated method stub

	}


