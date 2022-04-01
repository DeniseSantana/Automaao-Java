package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class MorePage implements PageMaker {

	// CT=28

	@FindBy(xpath = "//button[@id='btn2']")
	private WebElement btnPrincipal4;

	@FindBy(xpath = "//a[text()='More']")
	private WebElement btnMore;

	@FindBy(xpath = "//a[text()='Charts']")
	private WebElement btnCharts;

	@FindBy(xpath = "//h5[@class='text-uppercase']")
	private WebElement LblvalidandoMore;

	// CT=29
	@FindBy(xpath = "//a[text()='Dynamic Data']")
	private WebElement btnDynamicData;

	@FindBy(xpath = "//div[@class='cont_box_center']")
	private WebElement LblValidandoDynamicData;
	
	//CT=30
	
	@FindBy(xpath = "//a[text()='File Download']")
	private WebElement btnFileDownload;

	@FindBy(xpath = "//div[@class='cont_box']")
	private WebElement LblValidandoFileDownload;
	
	//CT=31
	
	@FindBy(xpath = "//a[text()='File Upload']")
	private WebElement btnFileUpload;
	
	@FindBy(xpath = "//input[@id='input-4']")
	private WebElement btnBrowser;
	
	@FindBy(xpath = "//label[@class=\'control-label\']")
	private WebElement LblValidandoFileUpload;
	
	//CT=32
	
	@FindBy(xpath = "//a[text()='JQuery ProgressBar']")
	private WebElement btnJQuery;
	
	@FindBy(xpath = "//button[@id='downloadButton']")
	private WebElement btnStartDownload;
	
	@FindBy(xpath = "//button[text()='Close']")
	private WebElement btnClose;
	
	@FindBy(xpath = "//button[@id='downloadButton']")
	private WebElement lblValidarJQuery;
	
	//CT=33
	
	@FindBy(xpath = "//a[text()='Loader']")
	private WebElement btnLoader;
	
	@FindBy(xpath = "//button[text()='Run']")
	private WebElement btnRun;
	
	@FindBy(xpath = "//button[text()='Close']")
	private WebElement btnClose2;
	
	@FindBy(xpath = "//div[text()='Bootstrap Modal']")
	private WebElement lblValidarLoader;
	
	//CT=34
	@FindBy(xpath = "//a[text()='Modals']")
	private WebElement btnModals;
	
	@FindBy(xpath = "(//a[text()='Launch modal'])[1]")
	private WebElement btnLaunchModal;
	
	@FindBy(xpath = "(//a[text()='Launch modal'])[2]")
	private WebElement btnBootstrapModal;;
	
	@FindBy(xpath = "(//button[text()='Close'])[2]")
	private WebElement btnClose3;
	
	@FindBy(xpath = "(//a[text()='Launch modal'])[2]")
	private WebElement btnMultipleModal;
	
	@FindBy(xpath = "(//button[text()='Close'])[1]")
	private WebElement btnClose4;
	
	@FindBy(xpath = "//h1[text()='Automation Demo Site ']")
	private WebElement lblValidandoModals;
	
	//CT=35
	@FindBy(xpath = "//a[text()='ProgressBar']")
	private WebElement btnProgressbar;
	
	@FindBy(xpath = "//button[@id='cricle-btn']")
	private WebElement btnDownload;
	
	@FindBy(xpath = "//div[@class='progressbar-text']")
	private WebElement lblValidandoProgressBar;
}
