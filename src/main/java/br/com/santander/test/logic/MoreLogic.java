package br.com.santander.test.logic;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;

import java.awt.AWTException;

import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.DemoPage;
import br.com.santander.test.pages.MorePage;
import br.com.santander.test.sheet.model.DemoData;
import br.com.santander.test.support.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoreLogic {
	private MorePage morePage;
	private DemoPage demoPage;
	private DemoData demoData;

	public MoreLogic() {

		morePage = PageMaker.getInstance(MorePage.class, web().getWebDriver());
		demoPage = new DemoPage();
		demoData = (DemoData) Context.testData();
	}

	public void clicandoMore() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		web().click(morePage.getBtnCharts());
		web().click(morePage.getBtnCharts());

	}

	public boolean validandoMore() {

		web().elementIsVisible(morePage.getLblvalidandoMore(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela more");
		return web().elementIsVisible(morePage.getLblvalidandoMore());
	}

	public void clicandoDynamicData() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		web().click(morePage.getBtnDynamicData());
		web().click(morePage.getBtnDynamicData());
	}

	public boolean validandoDynamicData() {

		web().elementIsVisible(morePage.getLblValidandoDynamicData(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela more");
		return web().elementIsVisible(morePage.getLblValidandoDynamicData());
	}

	public void clicandoFileDownload() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		web().click(morePage.getBtnFileDownload());
		web().click(morePage.getBtnFileDownload());
		rGen().registerStep(web().getScreenshot(), "clicando em Download");
		
	}
	public boolean validandoFileDownload() {

		web().elementIsVisible(morePage.getLblValidandoFileDownload(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela more");
		return web().elementIsVisible(morePage.getLblValidandoFileDownload());
	}

	public void clicandoFileUpload() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		rGen().registerStep(web().getScreenshot(), "clicando em More");
		web().click(morePage.getBtnFileUpload());
		web().click(morePage.getBtnFileUpload());
		rGen().registerStep(web().getScreenshot(), "clicando em upload");
		morePage.getBtnBrowser().sendKeys("C:\\Projeto Eclipse\\WhatsApp Image 2021-09-10 at 18.47.27.jpeg");
	}

	public boolean validandoUpload() {

		web().elementIsVisible(morePage.getLblValidandoFileUpload(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando tela upload");
		return web().elementIsVisible(morePage.getLblValidandoFileUpload());
	}

	public void clicandoJQuery() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		rGen().registerStep(web().getScreenshot(), "clicando em More");
		web().click(morePage.getBtnJQuery());
		web().click(morePage.getBtnJQuery());
		web().click(morePage.getBtnStartDownload());
		rGen().registerStep(web().getScreenshot(), "Clicando em download");
		web().sleep(7);
		web().click(morePage.getBtnClose());

	}

	public boolean validandoJQuery() {

		web().elementIsVisible(morePage.getLblValidarJQuery(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando JQuery");
		return web().elementIsVisible(morePage.getLblValidarJQuery());
	}

	public void clicandoLoader() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		rGen().registerStep(web().getScreenshot(), "clicando em More");
		web().click(morePage.getBtnLoader());
		web().click(morePage.getBtnLoader());
		web().click(morePage.getBtnRun());
		web().sleep(7);
		web().click(morePage.getBtnClose2());
		rGen().registerStep(web().getScreenshot(), "clicando em Close");

	}

	public boolean validandoLoader() {

		web().elementIsVisible(morePage.getLblValidarLoader(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando Loader");
		return web().elementIsVisible(morePage.getLblValidarLoader());
	}

	public void clicandoModals() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		rGen().registerStep(web().getScreenshot(), "clicando em More");
		web().click(morePage.getBtnModals());
		web().click(morePage.getBtnModals());
		rGen().registerStep(web().getScreenshot(), "clicando em modal");
		web().click(morePage.getBtnBootstrapModal());
		web().click(morePage.getBtnClose3());
		rGen().registerStep(web().getScreenshot(), "clicando em close");
		web().click(morePage.getBtnMultipleModal());
		web().click(morePage.getBtnClose4());
		rGen().registerStep(web().getScreenshot(), "clicando em close");
	}

	public boolean validandoModals() {

		web().elementIsVisible(morePage.getLblValidarLoader(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando Loader");
		return web().elementIsVisible(morePage.getLblValidarLoader());
	}

	public void clicandoProgressBar() {

		web().click(morePage.getBtnPrincipal4());
		web().click(morePage.getBtnMore());
		rGen().registerStep(web().getScreenshot(), "clicando em More");
		web().click(morePage.getBtnProgressbar());
		web().click(morePage.getBtnProgressbar());
		rGen().registerStep(web().getScreenshot(), "clicando ProgressBar");
		web().click(morePage.getBtnDownload());
		rGen().registerStep(web().getScreenshot(), "clicando Download");
		web().sleep(7);
		rGen().registerStep(web().getScreenshot(), "Fazendo Download");

	}
	public boolean validandoProgressBar() {

		web().elementIsVisible(morePage.getLblValidandoProgressBar(), 5); // validando a tela
		rGen().registerStep(web().getScreenshot(), "Validando ProgressBar");
		return web().elementIsVisible(morePage.getLblValidandoProgressBar());
	}

}
