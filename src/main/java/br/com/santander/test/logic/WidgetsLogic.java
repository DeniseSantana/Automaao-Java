package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Keys;

import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.WidgetsPage;


public class WidgetsLogic {

private WidgetsPage widgetsPage;
	
	public WidgetsLogic() {
		widgetsPage = PageMaker.getInstance(WidgetsPage.class, web().getWebDriver());
	
}
	
	public void navegacaodemoqademoautomationtesting() {
		web().navigateToUrl("http://demo.automationtesting.in/Register.html");
		web().getWebDriver().manage().window().maximize();
		rGen().registerStep(web().getScreenshot(), "Estou na Tela Principal");
	}
	
	public void acessaraccordion() {
		
		web().click(widgetsPage.getBtnWidgets());
		web().click(widgetsPage.getBtnAccordion());
		web().click(widgetsPage.getBtnAccordion());
		web().click(widgetsPage.getBtnCollapsible2());
		web().click(widgetsPage.getBtnCollapsible3());
		web().click(widgetsPage.getBtnCollapsible4());
	}
	
	public boolean Validaraccordion() {
		web().elementIsVisible(widgetsPage.getValidarPagina(), 5); 
		rGen().registerStep(web().getScreenshot(), ("Opções selecionadas"));
		return web().elementIsVisible(widgetsPage.getValidarPagina());
		
	}
	
public void acessarAutoComplete() {
		
		web().click(widgetsPage.getBtnWidgets());
		web().click(widgetsPage.getBtnAutoComplete());
		web().click(widgetsPage.getBtnAutoComplete());
		web().insertText(widgetsPage.getTxtAutoComplete(),"Brazil");
		web().insertKey(widgetsPage.getTxtAutoComplete(), Keys.ENTER);
	}
	
	public boolean ValidarAutoComplete() {
		web().elementIsVisible(widgetsPage.getValidarPagina(), 5); 
		rGen().registerStep(web().getScreenshot(), ("Dados Preenchidos"));
		return web().elementIsVisible(widgetsPage.getValidarPagina());
		
	}
	
	
public void acessarDataPicker() {
		
		web().click(widgetsPage.getBtnWidgets());
		web().doubleclick(widgetsPage.getBtnDatePicker());
		web().click(widgetsPage.getTxtDatePicker1());
		web().click(widgetsPage.getTxtDay());
		web().insertText(widgetsPage.getTxtDatePicker2(),"02/16/1989");
		web().insertKey(widgetsPage.getTxtDatePicker2(), Keys.ENTER);
		rGen().registerStep(web().getScreenshot(), ("Datas Preenchidas"));
	}
	
	public boolean ValidarDataPicker() {
		web().elementIsVisible(widgetsPage.getValidarPagina(), 5); 
		rGen().registerStep(web().getScreenshot(), ("Opções Preenchidas"));
		return web().elementIsVisible(widgetsPage.getValidarPagina());
	}	
	
public void acessarSlider() throws AWTException {
		
		web().click(widgetsPage.getBtnWidgets());
		web().click(widgetsPage.getBtnSlider());
		web().click(widgetsPage.getBtnSlider());
		rGen().registerStep(web().getScreenshot(), ("Inicio Slider"));
		
		Robot bot = new Robot();
		
		bot.mouseMove(335, 420);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		web().sleep(3);
		bot.mouseMove(900, 420);
		web().sleep(3);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    rGen().registerStep(web().getScreenshot(), ("Interação com o slider"));
	}
	
	public boolean ValidarSlider() {
		web().elementIsVisible(widgetsPage.getValidarPagina(), 5); 
		rGen().registerStep(web().getScreenshot(), ("Opções Preenchidas"));
		return web().elementIsVisible(widgetsPage.getValidarPagina());
	}	
	
}
