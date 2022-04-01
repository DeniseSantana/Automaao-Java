package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.DemoPage;
import br.com.santander.test.pages.VideoPage;

import br.com.santander.test.support.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VideoLogic {

	private VideoPage videoPage;
	private DemoPage demoPage;

	public VideoLogic() {

		videoPage = PageMaker.getInstance(VideoPage.class, web().getWebDriver());
		demoPage = new DemoPage();
	}

	public void clicandonaabavideo() throws AWTException {
		web().click(videoPage.getBtnPrincipal());
		web().click(videoPage.getBtnvideo()); // botao
		rGen().registerStep(web().getScreenshot(), "clicando em video");
		web().click(videoPage.getBtnyoutobe()); // botao
		web().click(videoPage.getBtnyoutobe());
		rGen().registerStep(web().getScreenshot(), "clicando em you to bo");
		Robot bot = new Robot();

		bot.mouseMove(500, 420);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		rGen().registerStep(web().getScreenshot(), ("clicando no botao play"));

	}

	public boolean validartelavideo() {

		web().elementIsVisible(videoPage.getBtnvalidarvideo(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela video");
		return web().elementIsVisible(videoPage.getBtnvalidarvideo()); // fechando o boolean
	}

	public void clicandonaabavimeo() throws AWTException {
		web().click(videoPage.getBtnPrincipal());
		web().click(videoPage.getBtnvideo()); // botao
		rGen().registerStep(web().getScreenshot(), "clicando em video");
		web().click(videoPage.getBtnvimeo()); // botao
		web().click(videoPage.getBtnvimeo()); // botao
		rGen().registerStep(web().getScreenshot(), "clicando em vimeo");
		Robot bot = new Robot();

		bot.mouseMove(500, 420);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		rGen().registerStep(web().getScreenshot(), ("clicando no botao play"));

	}

	public boolean validartelavimeo() {

		web().elementIsVisible(videoPage.getBtnvalidarvimeo(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela vimeo");
		return web().elementIsVisible(videoPage.getBtnvalidarvimeo()); // fechando o boolean
	}
}