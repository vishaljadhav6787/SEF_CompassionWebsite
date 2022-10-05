package org.SEF_Compassion.TestCases;

import org.SEF_Compassion.Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CompassionOnlyConstituent extends BaseClass {
	
	 @Parameters({"username","password"})
	 @Test(groups = {"All","OnlyConstituent"})
	  public void Constituent(@Optional("GC_1") String username, @Optional("G33con0404") String password) {
	  try {
				
		
	  System.out.println(">>>>>>>>>>>>>> START - CompassionWebsiteOnlyConstituent <<<<<<<<<<<<<<<<<<<<");
	 
	 
	  By byUsername = By.id("username");
      By byPassword = By.id("password");
      By byLoginButton = By.id("login");
      By onlyConstituent = By.xpath("(//a[text()='ONLY CONSTITUENT'])");
      By selectSupportType = By.xpath("(//label[text()='Select Supporter Group Type : ']/following::i[1])[2]");
      By title = By.xpath("(//label[text()='Title :']/following::i[1])[3]");
      By firstName = By.id("name0");
      By surName = By.id("surname0");
      By eMail = By.id("emailid0");
      By selectSupporterName = By.xpath("//*[@id=\"spt-details1\"]/div[1]/div[1]/div[2]/div[1]");
      By submit = By.xpath("(//*[@id=\"submit\"])[2]");
      By comfirmtext=By.xpath("//*[text()='Response']");
      By continueBtn = By.xpath("//*[@id=\"pleaseWaitDialog\"]/div[3]/div[3]");
      
      Utilities.hardWait(3);
      driver.findElement(byUsername).sendKeys(username);
      driver.findElement(byPassword).sendKeys(password);
      
      Utilities.hardWait(3);
      driver.findElement(byLoginButton).click();
      
      Utilities.hardWait(3);
      driver.findElement(onlyConstituent).click();
         
      Utilities.hardWait(4);
      selectDropDownGroup(driver ,driver.findElement(selectSupportType),"Individual");
      
      Utilities.hardWait(4);
      selectDropDownTitle(driver ,driver.findElement(title), "Mr");
      
      Utilities.hardWait(5);
      driver.findElement(firstName).sendKeys("David");
      driver.findElement(surName).sendKeys("Jackson");
      driver.findElement(eMail).sendKeys("jackson123@gmail.com");
      
      Utilities.hardWait(5);
      selectDropDownSupporter(driver ,driver.findElement(selectSupporterName), "David");
      
      Utilities.hardWait(5);
      driver.findElement(submit).click();
      
      Utilities.hardWait(5);
      String confirmationmessage = driver.findElement(comfirmtext).getText();
	  System.out.println(confirmationmessage);
      
      Utilities.hardWait(60);
      driver.findElement(continueBtn).click();
      
      
  	 System.out.println(">>>>>>>> END - CompassionWebsiteOnlyConstituent <<<<<<<<<<<<<<<<<<<<");

	 }   catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	 }
			}
	 public void selectDropDownGroup(WebDriver driver ,WebElement element, String value) {
	    	element.click();
	    	driver.findElement(By.xpath("(//div[text()='"+value+"'][1])[2]")).click();
	    }

	 public void selectDropDownTitle(WebDriver driver ,WebElement element, String value) {
	    	element.click();
	    	driver.findElement(By.xpath("(//div[text()='"+value+"'][1])[3]")).click();
	    }
	 public void selectDropDownSupporter(WebDriver driver ,WebElement element, String value) {
	    	element.click();
	    	driver.findElement(By.xpath("(//div[text()='"+value+"'][1])[1]")).click();
	    }
	 
}