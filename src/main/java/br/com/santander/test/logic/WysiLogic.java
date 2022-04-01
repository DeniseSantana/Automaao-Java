package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Keys;

import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.DemoPage;
import br.com.santander.test.pages.VideoPage;
import br.com.santander.test.pages.WysiPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WysiLogic {

	private WysiPage wysiPage;
	private DemoPage demoPage;

	public WysiLogic() {

		wysiPage = PageMaker.getInstance(WysiPage.class, web().getWebDriver());
		demoPage = new DemoPage();
	}

	public void clicandoTinyMCE() throws AWTException {

		web().click(wysiPage.getBtnPrincipal());
		web().click(wysiPage.getBtnwysi());
		web().click(wysiPage.getBtntiny());
		web().click(wysiPage.getBtntiny());
		web().insertText(wysiPage.getCmpcaixa(), "Interagindo com a caixa wysi");
		rGen().registerStep(web().getScreenshot(), "Interagindo com a caixa wysi");
		Robot bot = new Robot();

		bot.mouseMove(250, 550);
		web().sleep(3);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseMove(600, 650);
		web().sleep(3);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		rGen().registerStep(web().getScreenshot(), ("clicando no botao da caixa"));

	}

	public boolean validandotelatinymce() {

		web().elementIsVisible(wysiPage.getLblValidarTela(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela");
		return web().elementIsVisible(wysiPage.getLblValidarTela());
	}

	public void clicandoCkeditor() {

		web().click(wysiPage.getBtnPrincipal());
		web().click(wysiPage.getBtnwysi());
		web().click(wysiPage.getBtnCkeditor());
		web().click(wysiPage.getBtnCkeditor());
		web().click(wysiPage.getBtnB());
		web().sleep(5);
		web().insertText(wysiPage.getCmpCaixa2(), "Bom dia");
		rGen().registerStep(web().getScreenshot(), "Interagindo com a caixa ckeditor");
		web().click(wysiPage.getBtnEstilo());
		web().click(wysiPage.getBtnItalic());
		web().click(wysiPage.getBtnFomatar());
		web().click(wysiPage.getBtnTitulo1());
		web().click(wysiPage.getBtnMaximizar());
		web().sleep(3);
		web().click(wysiPage.getBtnMaximizar());

	}
	public boolean validarCkeditor() {

		web().elementIsVisible(wysiPage.getValidarckeditor(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela ckeditor");
		return web().elementIsVisible(wysiPage.getValidarckeditor());
	}
	
	public void AcessarSummer() {
		
		web().click(wysiPage.getBtnPrincipal());
		web().click(wysiPage.getBtnwysi());
		web().click(wysiPage.getBtnsummernote());
		web().click(wysiPage.getBtnsummernote());
		rGen().registerStep(web().getScreenshot(), "Interagindo com o SummerNote");
		web().click(wysiPage.getBtnImagem());
		web().click(wysiPage.getCmpEscolherArquivo());
		rGen().registerStep(web().getScreenshot(), "Botão Escolher Arquivo Selecionado");
		web().insertText(wysiPage.getCmpEscolherArquivo(),"C:\\Users\\denise.santana\\Desktop\\Treinamento\\captura.png");
	}
	public boolean validarSummer() {

		web().elementIsVisible(wysiPage.getValidarckeditor(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando Tela Summer");
		return web().elementIsVisible(wysiPage.getValidarckeditor());
	}
	
public void AcessarCodeMirror() {
		
		web().click(wysiPage.getBtnPrincipal());
		web().click(wysiPage.getBtnwysi());
		web().click(wysiPage.getBtnCodeMirror());
		web().click(wysiPage.getBtnCodeMirror());
		rGen().registerStep(web().getScreenshot(), "Interagindo com caixa");
		web().insertText(wysiPage.getCmpCaixa3(), "Moreno Dorminhoco");
		web().sendTab(wysiPage.getCmpCaixa3());
		web().insertText(wysiPage.getCmpCaixa3(), "Denise Preguiçosa");
		web().insertKey(wysiPage.getCmpCaixa3(),Keys.ENTER);
		rGen().registerStep(web().getScreenshot(), "Dados inseridos");
	}
	public boolean ValidarCodeMirror() {

		web().elementIsVisible(wysiPage.getLblvalidarCodeMirror(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando code mirror");
		return web().elementIsVisible(wysiPage.getLblvalidarCodeMirror());
	}
}
