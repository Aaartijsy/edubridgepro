
		package pages;

		//import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		import testbase.WebTestBase;

		public class HomePage extends WebTestBase { 	 	
			
			@FindBy(xpath="//*[@class='header-main__signup login-modal-btn']" )   
			WebElement usersearch;     
			public HomePage(){         
				PageFactory.initElements(driver,this);     
				}     
			public void userSearchClick(){       
				usersearch.click();    
				} 
			
		// TODO Auto-generated method stub

	}


