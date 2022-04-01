package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;


@Getter
public class LoginPage implements PageMaker {
	public static final String saucedemo = "https://www.saucedemo.com";

	@FindBy(id = "user-name")
	private WebElement campologin;                // aonde buscamos por elementos

	@FindBy(id = "password")
	private WebElement camposenha;        // aonde buscamos por elementos

	@FindBy(name = "login-button")                
	private WebElement btnlogin;             // aonde buscamos por elementos

	@FindBy(id = "shopping_cart_container")                
	private WebElement validarlogin; 
	
	@FindBy(xpath = "//h3[text()='Epic sadface: Username and password do not match any user in this service']")                
	private WebElement errodelogin; 
	
	
	
}

	


