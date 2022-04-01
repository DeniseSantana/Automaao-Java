package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class WidgetsPage implements PageMaker{

	//CT=200
	
	@FindBy(xpath = "//a[text() = 'Widgets']")
	private WebElement btnWidgets;
	@FindBy(xpath = "//a[text() = ' Accordion ']")
	private WebElement btnAccordion;
	@FindBy(xpath = "//b[text() = 'Collapsible Group 2 - Single Line Coding']")
	private WebElement btnCollapsible2;
	@FindBy(xpath = "//b[text() = 'Collapsible Group 3 - Methhod Chaining']")
	private WebElement btnCollapsible3;
	@FindBy(xpath = "//b[text() = 'Collapsible Group 4 - Cross Browser Testing']")
	private WebElement btnCollapsible4;
	@FindBy(xpath = "//h1[text() = 'Automation Demo Site ']")
	private WebElement validarPagina;
	
	
	//CT=201
	
	@FindBy(xpath = "//a[text() = ' AutoComplete ']")
	private WebElement btnAutoComplete;
	@FindBy(xpath = "//input[@id = 'searchbox']")
	private WebElement txtAutoComplete;
	
	//CT=202
	
	@FindBy(xpath = "//a[text() = ' Datepicker ']")
	private WebElement btnDatePicker;
	@FindBy(id = "datepicker1")
	private WebElement txtDatePicker1;
	@FindBy(xpath = "//a[text()='24']")
	private WebElement txtDay;
	@FindBy(xpath = "//input[@id='datepicker2']")
	private WebElement txtDatePicker2;

	//CT=203
	
	@FindBy(xpath = "//a[text() = ' Slider ']")
	private WebElement btnSlider;
	@FindBy(xpath = "//a[@class='ui-slider-handle ui-state-default ui-corner-all']")
	private WebElement Slider;
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
