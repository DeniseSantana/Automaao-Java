package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;
import static org.testng.Assert.assertTrue;

import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.LoginPage;
import br.com.santander.test.sheet.model.LoginData;
import br.com.santander.test.support.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginLogic {
	
	private LoginPage loginPage;
	private LoginData loginData;
	
	public LoginLogic() {
		loginPage = PageMaker.getInstance(LoginPage.class, web().getWebDriver());
		loginData = (LoginData) Context.testData();
	}

	public void navegacaosaucedemo() {
		log.info("que estou na tela de login");       // ultilizamos  para chamar o site
		web().navigateToUrl(LoginPage.saucedemo);             
		web().getWebDriver().manage().window().maximize();
	
	}
	
	
	public void inserindousuarioesenha() {  		
		web().insertText(loginPage.getCampologin(), loginData.getUsuario());
		web().insertText(loginPage.getCamposenha(), loginData.getSenha());
		rGen().registerStep(web().getScreenshot(), "insiro usuario e senha");  // print e menssagem da tela
		web().click(loginPage.getBtnlogin()); // botao
	}

	public void validarteladelogin() {
		web().elementIsVisible(loginPage.getValidarlogin(), 5);  // validando com o metodo todo 
		rGen().registerStep(web().getScreenshot(),"e realizado o login com sucesso");   
		assertTrue(loginPage.getValidarlogin().isDisplayed());
	}
	
	public void usuarioincorreto() {
		web().insertText(loginPage.getCampologin(), loginData.getUsuario());
		web().insertText(loginPage.getCamposenha(), loginData.getSenha());
		rGen().registerStep(web().getScreenshot(), "insiro usuario e senha incorreto");
		web().click(loginPage.getBtnlogin());
		
		
	}
	public void validarteladeloginincorreto() {	                  // validando a tela 
		web().elementIsVisible(loginPage.getErrodelogin(), 5);
		rGen().registerStep(web().getScreenshot(),"realiza o login invalido");
		assertTrue(loginPage.getErrodelogin().isDisplayed());
	}

	
	
	
}
