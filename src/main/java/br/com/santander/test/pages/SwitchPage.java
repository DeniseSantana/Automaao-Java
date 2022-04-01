package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class SwitchPage implements PageMaker {

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
	private WebElement btnswitch; // aonde buscamos por elementos
	@FindBy(xpath = "//a[text()='Alerts']")
	private WebElement btnalerts; // aonde buscamos por elementos
	@FindBy(xpath = "//a[text()='Alert with OK ']")
	private WebElement btnalertwith;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement validaralertsbox;

	@FindBy(xpath = "//a[text()='Alert with OK & Cancel ']")
	private WebElement alertcancel;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement validarconfirmbox;

	@FindBy(xpath = "//a[text()='Alert with Textbox ']")
	private WebElement alerttextbox;
	// @FindBy(xpath = "//button[@class='btn btn-info']")
	@FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
	private WebElement validarpromptbox;

	@FindBy(xpath = "//a[text()='Windows']")
	private WebElement btnwindows;
	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement btnclick;
	@FindBy(xpath = "//div[@class='pt-3 lead']")
	private WebElement validandoclick;

	@FindBy(xpath = "//a[text()='Open New Seperate Windows']")
	private WebElement btnseperatewindows;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btnclick2;
	@FindBy(xpath = "//div[@class='text-center']")
	private WebElement validandoclick2;

	@FindBy(xpath = "//a[text()='Open Seperate Multiple Windows']")
	private WebElement btnmultipliquewindows;
	@FindBy(xpath = "//div[@id=\"Multiple\"]//following::button")
	private WebElement btnclick3;
	@FindBy(xpath = "//img[@id='logo']")
	private WebElement validarwindowslogo;

	@FindBy(xpath = "//a[text () = 'Frames'] ")
	private WebElement btnframes;
	@FindBy(xpath = "//a[text()='Single Iframe ']")
	private WebElement singleiframe;
	@FindBy(xpath = "//a[text () = 'Iframe with in an Iframe'] ")
	private WebElement Iframe;
	@FindBy(xpath = "//h1[@class='display-1 mt-0 mt-md-5 pb-1']")
	private WebElement validarselenium;
	@FindBy(xpath = "//h1[text()='Automation Demo Site ']")
	private WebElement validarframes;
}
