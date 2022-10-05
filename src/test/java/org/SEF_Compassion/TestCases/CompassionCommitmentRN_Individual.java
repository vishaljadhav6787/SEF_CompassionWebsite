package org.SEF_Compassion.TestCases;

import org.SEF_Compassion.Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompassionCommitmentRN_Individual extends BaseClass {
	
	    @Parameters({"username","password"})
	    @Test (groups = {"All","RN_Individual"})
	    public void commitment(@Optional("GC_1") String username, @Optional("G33con0404") String password) throws InterruptedException{
	    	 try {
	    		 
		 Actions a=new Actions(driver);
	    // String Day="22";
		 String month="October 2022";
		 
	        System.out.println(">>>>>>>>>>>>>> START - CompassionWebsiteCommitment <<<<<<<<<<<<<<<<<<<<");
	        
	        By byUsername = By.id("username");
	        By byPassword = By.id("password");
	        By byLoginButton = By.id("login");
	        By globalChilPool= By.xpath("//*[@id=\"tab-commitment\"]/div/div[2]/div[2]/div[2]/input");	 
	        By globalSearch = By.id("global-search");
	    	By holdandImport = By.xpath("(//button[text()='Hold & Import in RN'])[1]");
			By benficiaryID = By.id("childnumber");
	        By rnChildPool = By.name("child-pool");
	        By referenceId = By.xpath("(//input[@name='referenceid'])[1]");
	        By searchBtn = By.id("specific-search");
	        By selectChild = By.id("select-child");
	        By applicationId = By.id("barcode");
	        By title = By.xpath("(//label[text()='Title :']/following::i[1])[1]");
	        By firstName = By.id("name0");
	        By surName = By.id("surname0");
	        By eMail = By.id("emailid0");
	        By supporterGrpName = By.xpath("(//label[text()='Supporter Group Preferred Name: ']/following::i[1])[1]");
	        By ddiSource = By.xpath("(//label[text()='DDI Source : ']/following::i[1])[1]");
	        By accountName = By.id("accountname");
	        By accountNumber = By.id("accountnumber");
	        By sortCode = By.id("sortcode");
	        By validBankAccount = By.id("validateBankAccount");
	        By fDonationDate = By.id("ffdate");
	        By submitBtn = By.id("submit");
	        By continueBtn = By.xpath("//div[@class='ui cancel blue button continue']");
	        By sponsorshipSourceDropDown=By.xpath("//label[text()='Sponsorship Source : ']/following::i[1]");
	        By Spo_Group_Type=  By.xpath("(//label[text()='Select Supporter Group Type : ']/following::i[1])[1]");
	        By ddOptionSelect=By.xpath("//*[@id=\"mainform\"]/div[7]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]");
	        By monthYear=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div");
	        By monthYearNext=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span");
	        By date=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a");
	        By comfirmtext=By.xpath("//*[text()='Response']");
	        
	        Utilities.hardWait(3);
	        driver.findElement(byUsername).sendKeys(username);
	        driver.findElement(byPassword).sendKeys(password);
	        
	        Utilities.hardWait(3);
	        driver.findElement(byLoginButton).click();
	        
	        Utilities.hardWait(2);
	        driver.findElement(globalChilPool).click();
	        
	        Utilities.hardWait(4);
	        driver.findElement(globalSearch).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(holdandImport).click();
	        
	        Utilities.hardWait(4);
	        driver.findElement(benficiaryID).click();

	        Utilities.hardWait(4);
	        String benificiary_ID = driver.findElement(benficiaryID).getAttribute("value");
 	       
	        Utilities.hardWait(8);
	        driver.findElement(rnChildPool).click();
	        Utilities.hardWait(6);
	        WebElement e = driver.findElement(referenceId);
	        a.moveToElement(e);
	        a.click();
	        
	        Utilities.hardWait(4);
	        a.sendKeys(benificiary_ID).build().perform();
	        Utilities.hardWait(4);

	        Utilities.hardWait(5);
	        driver.findElement(searchBtn).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(selectChild).click();
	        
	        Utilities.hardWait(2);
	        driver.findElement(applicationId).sendKeys("1150");
	        
	        Utilities.hardWait(4);
	        selectDropDownValue(driver ,driver.findElement(sponsorshipSourceDropDown), "Child profile");
	        
	        Utilities.hardWait(5);
	        selectDropDownValue(driver ,driver.findElement(Spo_Group_Type), "Individual");
	         
	        Utilities.hardWait(5);
	        selectDropDownValue(driver ,driver.findElement(title), "Mr");
	        
	        Utilities.hardWait(5);
	        driver.findElement(firstName).sendKeys("David");
	        driver.findElement(surName).sendKeys("Jackson");
	        driver.findElement(eMail).sendKeys("jackson123@gmail.com");
	        
	        Utilities.hardWait(5);
	        selectDropDownValue(driver ,driver.findElement(supporterGrpName), "David");
	        
	        Utilities.hardWait(5);
	        driver.findElement(ddiSource).click();
	        Utilities.hardWait(2);
	        driver.findElement(ddOptionSelect).click();
	        
	        //Utilities.hardWait(3);
	        //selectDropDownValue(driver ,driver.findElement(ddiSource), "Child profile");
	        
	        Utilities.hardWait(5);
	        driver.findElement(accountName).sendKeys("David");
	        driver.findElement(accountNumber).sendKeys("34661743");
	        driver.findElement(sortCode).sendKeys("602003");
	        
	        Utilities.hardWait(3);
	        driver.findElement(validBankAccount).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(fDonationDate).click();
	        while(true) {
	        	String text=driver.findElement(monthYear).getText();
	        	
	        	if(text.equals(month)) {
	        		break;
	        	}
	        	else {
	        		driver.findElement(monthYearNext).click();
	        	}
	        }
	        Utilities.hardWait(8);
	        driver.findElement(date).click();
	      
	        Utilities.hardWait(5);
	        driver.findElement(submitBtn).click();
	        
	        Utilities.hardWait(5);
	        String confirmationmessage = driver.findElement(comfirmtext).getText();
		    System.out.println(confirmationmessage);
	        
	        Utilities.hardWait(60);
	        driver.findElement(continueBtn).click();
	        
	   
	    	
	    	 System.out.println(">>>>>>>> END - CompassionWebsiteCommitment <<<<<<<<<<<<<<<<<<<<");
	    	
	    }   catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			}
        }
	
	 public void selectDropDownValue(WebDriver driver ,WebElement element, String value) {
	    	element.click();
	    	driver.findElement(By.xpath("(//div[text()='"+value+"'][1])")).click();
	    }


}


