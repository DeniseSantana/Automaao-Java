package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;

import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.LoginPage;
import br.com.santander.test.pages.SwitchPage;
import br.com.santander.test.sheet.model.LoginData;
import br.com.santander.test.support.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchLogic {
	private SwitchPage switchPage;

	public SwitchLogic() {
		switchPage = PageMaker.getInstance(SwitchPage.class, web().getWebDriver());

	}

	public void navegacaodemoautomation() {
		web().navigateToUrl("http://demo.automationtesting.in/Register.html");
		web().getWebDriver().manage().window().maximize();
		rGen().registerStep(web().getScreenshot(), "estou na tela site");// pede pra registrar e fazer um
																			// print
	}

	public void clicandoAlerts() {

		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnalerts());
		web().click(switchPage.getBtnalerts());
		rGen().registerStep(web().getScreenshot(), "clicando no botao alerts");
		web().click(switchPage.getBtnalertwith());
		rGen().registerStep(web().getScreenshot(), "clicando botao alert with");
		web().click(switchPage.getValidaralertsbox());
		rGen().registerStep(web().getScreenshot(), "clicando botao alert box");

	}

	public boolean validaralerts() {
		web().elementIsVisible(switchPage.getValidaralertsbox(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando alerts");
		return web().elementIsVisible(switchPage.getValidaralertsbox()); // fechando o boolean
	}

	public void clicarAlerts() {
		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnalerts());
		web().click(switchPage.getBtnalerts());
		rGen().registerStep(web().getScreenshot(), "clicando no botao alerts");
		web().click(switchPage.getAlertcancel());
		rGen().registerStep(web().getScreenshot(), "clicando botao alert ok ou cancel");
		web().click(switchPage.getValidarconfirmbox());
		rGen().registerStep(web().getScreenshot(), "clicando no botao confirm box");
		// web().sleep(4);
		// Alert alert = web().getWebDriver().switchTo().alert();
		// alert.accept();
		// rGen().registerStep(web().getScreenshot(), ("Botão OK selecionado"));
		// web().sleep(3);
	}

	public boolean validaralertsconfirmbox() {
		web().elementIsVisible(switchPage.getValidaralertsbox(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando alerts");
		return web().elementIsVisible(switchPage.getValidaralertsbox()); // fechando o boolean
	}

	public void clicoAlerts() {
		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnalerts());
		web().click(switchPage.getBtnalerts());
		rGen().registerStep(web().getScreenshot(), "clicando no botao alerts");
		web().click(switchPage.getAlerttextbox());
		rGen().registerStep(web().getScreenshot(), "clicando botao alert ok ou cancel");
		web().click(switchPage.getValidarpromptbox());
		rGen().registerStep(web().getScreenshot(), "clicando no botao text box");
		// Alert caixa = web().getWebDriver().switchTo().alert();
		// caixa.sendKeys("Denise");
		// caixa.accept();
	}

	public boolean validaralertspromptbox() {
		web().elementIsVisible(switchPage.getValidarpromptbox(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando alerts");
		return web().elementIsVisible(switchPage.getValidarpromptbox()); // fechando o boolean
	}

	public void clicandowindows() {
		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnwindows());
		web().click(switchPage.getBtnwindows());
		rGen().registerStep(web().getScreenshot(), "clicando no botao windows");
		web().click(switchPage.getBtnclick());
		rGen().registerStep(web().getScreenshot(), "clicando botao click");

	}

	public boolean validandowindows() {

		List<String> windowHandles = new ArrayList<>(web().getWebDriver().getWindowHandles());
		web().getWebDriver().switchTo().window(windowHandles.get(1));
		web().elementIsVisible(switchPage.getValidandoclick(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando windows");
		return web().elementIsVisible(switchPage.getValidandoclick()); // fechando o boolean

	}

	public void clicandoseperatewindows() {
		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnwindows());
		web().click(switchPage.getBtnwindows());
		rGen().registerStep(web().getScreenshot(), "clicando no botao windows");
		web().click(switchPage.getBtnseperatewindows());
		rGen().registerStep(web().getScreenshot(), "clicando botao seperate windows ");
		web().click(switchPage.getBtnclick2());
		rGen().registerStep(web().getScreenshot(), "clicando botao click2 ");
	}

	public boolean validandoseperatewindows() {
		// metodo para interagir com uma nova janela
		List<String> windowHandles = new ArrayList<>(web().getWebDriver().getWindowHandles());
		web().getWebDriver().switchTo().window(windowHandles.get(1));
		web().elementIsVisible(switchPage.getValidandoclick2(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando seperate windows");
		return web().elementIsVisible(switchPage.getValidandoclick2()); // fechando o boolean

	}

	public void clicandomultipliquewindows() {
		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnwindows());
		web().click(switchPage.getBtnwindows());
		rGen().registerStep(web().getScreenshot(), "clicando no botao windows");
		web().click(switchPage.getBtnmultipliquewindows());
		rGen().registerStep(web().getScreenshot(), "clicando botao multiplique windows ");
		web().click(switchPage.getBtnclick3());
		rGen().registerStep(web().getScreenshot(), "clicando botao click3 ");
		// web().navigateToUrl("http://demo.automationtesting.in/Index.html");
	}

	public boolean validandojanelaselenium() {
		// metodo para interagir com uma nova janela
		List<String> windowHandles = new ArrayList<>(web().getWebDriver().getWindowHandles());
		web().getWebDriver().switchTo().window(windowHandles.get(1));
		web().elementIsVisible(switchPage.getValidarselenium(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando multiplique windows");
		return web().elementIsVisible(switchPage.getValidarselenium()); // fechando o boolean

	}

	public boolean validandomultipliquewindows() {
		// metodo para interagir com uma nova janela
		List<String> windowHandles = new ArrayList<>(web().getWebDriver().getWindowHandles());
		web().getWebDriver().switchTo().window(windowHandles.get(2));
		web().elementIsVisible(switchPage.getValidarwindowslogo(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando multiplique windows");
		return web().elementIsVisible(switchPage.getValidarwindowslogo()); // fechando o boolean

	}

	public void clicandoframes() {
		web().click(switchPage.getBtnswitch());
		rGen().registerStep(web().getScreenshot(), "clicando botao switch");
		web().click(switchPage.getBtnwindows());
		web().click(switchPage.getBtnwindows());
		rGen().registerStep(web().getScreenshot(), "clicando no botao windows");
		web().click(switchPage.getBtnframes());
		rGen().registerStep(web().getScreenshot(), "clicando botao frames ");
		web().click(switchPage.getIframe());
		rGen().registerStep(web().getScreenshot(), "clicando botao Iframe ");
	}

	public boolean validarframes() {
		web().elementIsVisible(switchPage.getValidarframes(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando frames");
		return web().elementIsVisible(switchPage.getValidarframes()); // fechando o boolean
	}
}