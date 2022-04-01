package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class DemoPage implements PageMaker {
	

	//CT=01
	
	@FindBy(xpath = "//button[@id='btn2']")
	private WebElement btnPrincipal;                // aonde buscamos por elementos

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement cmpFirstName;        // aonde buscamos por elementos

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement cmpLastName;             // aonde buscamos por elementos

	@FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	private WebElement cmpAdress;   
	
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")
	private WebElement cmpEmail; 

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement cmpPhone;  
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement rdbGender; 
	
	@FindBy(xpath = "//input[@id='checkbox2']")
	private WebElement chkHobbies; 
	
	@FindBy(xpath = "//div[@id='msdd']")
	private WebElement cmpLanguages; 
	

	@FindBy(xpath = "(//a[text()='English'])")
	private WebElement cmpLanguages1;
	
	
	@FindBy(xpath = "//select[@id='Skills']")
	private WebElement cmbSkills; 
	
	@FindBy(xpath = "//select[@id='countries']")
	private WebElement cmbCountry; 
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	private WebElement cmbSelectCountry; 
	
	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted'])")
	private WebElement cmbSelectCountry1; 
	
	@FindBy(xpath = "//select[@id='yearbox']")
	private WebElement cmbYear; 
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	private WebElement cmbMonth; 
	
	@FindBy(xpath = "//select[@id='daybox']")
	private WebElement cmbDay; 
	
	@FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement cmpPassoword; 
	
	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement cmpConfirmPassoword; 
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	private WebElement btnSubmit; 
	
}

