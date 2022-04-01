package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.web;

import org.openqa.selenium.Keys;

import static br.com.santander.test.support.Context.rGen;
import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.DemoPage;
import br.com.santander.test.sheet.model.DemoData;
import br.com.santander.test.support.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoLogic {

	private DemoPage demoPage;
	private DemoData demoData;

	public DemoLogic() {
		demoPage = PageMaker.getInstance(DemoPage.class, web().getWebDriver());
		demoData = (DemoData) Context.testData();
	}

	public void navegacaodemo() {

		web().navigateToUrl("http://demo.automationtesting.in/");
		web().getWebDriver().manage().window().maximize();
		rGen().registerStep(web().getScreenshot(), "Estou na tela principal");

	}

	public void clicandoemskipsign() {

		web().click(demoPage.getBtnPrincipal()); // botao
		rGen().registerStep(web().getScreenshot(), "clicando em skip");
	}

	public void criandousuario() {
		web().insertText(demoPage.getCmpFirstName(), demoData.getFirstname());
		web().insertText(demoPage.getCmpLastName(), demoData.getLastname());
		web().insertText(demoPage.getCmpAdress(), demoData.getAdress());
		web().insertText(demoPage.getCmpEmail(), demoData.getEmail());
		web().insertText(demoPage.getCmpPhone(), demoData.getPhone());
		web().click(demoPage.getRdbGender());
		web().click(demoPage.getChkHobbies());
		web().click(demoPage.getCmpLanguages());
		web().click(demoPage.getCmpLanguages1());
		web().selectElementByValue(demoPage.getCmbSkills(), "Java");
		web().selectElementByValue(demoPage.getCmbCountry(), "select country");
		//web().selectElementByValue(demoPage.getCmbSelectCountry(), "japan");
		web().click(demoPage.getCmbSelectCountry());
		web().selectElementByValue(demoPage.getCmbSelectCountry1(), "Japan");
		web().selectElementByValue(demoPage.getCmbYear(), "1989");
		web().selectElementByValue(demoPage.getCmbMonth(), "February");
		web().selectElementByValue(demoPage.getCmbDay(), "16");
		web().insertText(demoPage.getCmpPassoword(), demoData.getPassword());
		web().insertText(demoPage.getCmpConfirmPassoword(), demoData.getConfirmpassword());
		rGen().registerStep(web().getScreenshot(), "insiro todos os dados"); // print e menssagem da tela

	}
	public boolean validarcriacao() {

		web().elementIsVisible(demoPage.getBtnSubmit(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando criacao");
		return web().elementIsVisible(demoPage.getBtnSubmit()); // fechando o boolean
	}
}