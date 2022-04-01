package br.com.santander.test.steps;

import br.com.santander.test.logic.LoginLogic;
import br.com.santander.test.sheet.model.LoginData;
import br.com.santander.test.support.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private LoginLogic loginLogic;
	private LoginData loginData;
	
	public LoginSteps() {
		loginLogic = new LoginLogic();  // chamamos o metodo do
		 loginData = (LoginData) Context.testData();
	}
	
	@Given("que estou na tela de login")
	public void given() {
		loginLogic.navegacaosaucedemo();
	}

	@When("insiro usuario e senha")
	public void when() {
		loginLogic.inserindousuarioesenha(); 
										  	
	}

	@Then("e realizado o login com sucesso")
	public void then() {
		loginLogic.validarteladelogin();
	}
	
	@When("insiro usuario e senha incorreto")
	public void incorreto() {
		loginLogic.usuarioincorreto();
	}
	
	@Then("e realizado o login invalido")
	public void errodelogin() {
		loginLogic.validarteladeloginincorreto();
	}
	
}
