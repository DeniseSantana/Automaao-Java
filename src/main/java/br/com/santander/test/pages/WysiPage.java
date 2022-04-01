package br.com.santander.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class WysiPage implements PageMaker {
	
	@FindBy(xpath = "//button[@id='btn2']")
	private WebElement btnPrincipal; 
	
	@FindBy(xpath = "//a[text()='WYSIWYG']")
	private WebElement btnwysi;                // aonde buscamos por elementos

	@FindBy(xpath = "(//a[@style='color: white'])[14]")
	private WebElement btntiny; 
	
	@FindBy(xpath = "//textarea")
	private WebElement cmpcaixa;
	
	@FindBy(xpath = "//h4[text()='TinyMCE']")
	private WebElement lblValidarTela;
	
	//CT=25
	
	@FindBy(xpath = "//button[@id='btn2']")
	private WebElement btnPrincipal3;
	
	@FindBy(xpath = "//a[text()='WYSIWYG']")
	private WebElement btnWysiwyg;
	
	@FindBy(xpath = "(//a[@style='color: white'])[15]")
	private WebElement btnCkeditor ;
	
	@FindBy(xpath = "//span[@class='cke_button_icon cke_button__bold_icon']")
	private WebElement btnB;
	
	@FindBy(xpath = "//iframe[@title='Editor de Rich Text, editor1']")
	private WebElement cmpCaixa2;

	@FindBy(xpath = "//span[@id='cke_9_text']")
	private WebElement btnEstilo;
	
	@FindBy(xpath = "//span[text()='Italic Title']")
	private WebElement btnItalic;
	
	@FindBy(xpath = "//span[@id='cke_10_text']")
	private WebElement btnFomatar;
	
	@FindBy(xpath = "//span[text()='Título 1']")
	private WebElement btnTitulo1;
	
	@FindBy(xpath = "//span[@class='cke_button_icon cke_button__maximize_icon']")
	private WebElement btnMaximizar;
	
	@FindBy(xpath = "//h4[@class='center']")
	private WebElement validarckeditor;
	
	//CT=26
	@FindBy(xpath = "//button[@id='btn2']")
	private WebElement btnPrincipal4;
	
	@FindBy(xpath = "//a[text()='WYSIWYG']")
	private WebElement btnWysiwyg1;
	
	@FindBy(xpath = "(//a[@style='color: white'])[16]")
	private WebElement btnsummernote;
	
	@FindBy(xpath = "(//button[@class='note-btn btn btn-default btn-sm'])[11]")
	private WebElement btnImagem;
	
	@FindBy(xpath = "//input[@class='note-image-input form-control']")
	private WebElement cmpEscolherArquivo;
	
	@FindBy(xpath ="//h4[text()='SummerNote']")
	private WebElement lblValidarSummer;
	
	//CT=27
	
	@FindBy(xpath = "(//a[@style='color: white'])[17]")
	private WebElement btnCodeMirror;
	
	@FindBy(xpath ="//div[@class='CodeMirror-scroll']")
	private WebElement cmpCaixa3;
	
	@FindBy(xpath = "//h4[text()='CodeMirror']")
	private WebElement lblvalidarCodeMirror;
	
	
}
