package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class VideoPage implements PageMaker{
	
	@FindBy(xpath = "//button[@id='btn2']")
	private WebElement btnPrincipal; 
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[5]")
	private WebElement btnvideo;                // aonde buscamos por elementos

	@FindBy(xpath = "(//a[@style='color: white'])[12]")
	private WebElement btnyoutobe;        // aonde buscamos por elementos
	
	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button']")
	private WebElement btnplay;        // aonde buscamos por elementos
	
	@FindBy(xpath = "//a[@class='ytp-title-link yt-uix-sessionlink']")
	private WebElement btnvalidarvideo;  
	
	//CT=23
	
	@FindBy(xpath = "(//a[@style='color: white'])[13]")
	private WebElement btnvimeo;        // aonde buscamos por elementos
	
	@FindBy(xpath = "//div[@class='play-icon']")
	private WebElement btnplay2;        // aonde buscamos por elementos
	
	@FindBy(xpath = "//div[@class='headers']")
	private WebElement btnvalidarvimeo;        // aonde buscamos por elementos
}