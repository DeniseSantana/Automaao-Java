package br.com.santander.test.steps;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import br.com.santander.test.logic.DemoLogic;
import br.com.santander.test.logic.MoreLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoreSteps {

	private MoreLogic moreLogic;
	private DemoLogic demoLogic;

	public MoreSteps() {

		moreLogic = new MoreLogic(); // chamamos o metodo do
		demoLogic = new DemoLogic();
	}

	@Given("que estou na tela principal da pagina")
	public void que_estou_na_tela_principal_do_site() {
		demoLogic.navegacaodemo();
	}

	@When("clico em  more e depois clico em chats")
	public void clico_em_more_e_depois_clico_em_chats() {
		moreLogic.clicandoMore();

	}

	@Then("valido que estou na tela more com sucesso")
	public void valido_que_estou_na_tela_more_com_sucesso() {
		assertTrue(moreLogic.validandoMore());
	}

	@When("clico em more e depois clico em dynamic data")
	public void clico_em_more_e_depois_clico_em_dynamic_data() {
		moreLogic.clicandoDynamicData();

	}

	@Then("valido que estou na tela dynamic data com sucesso")
	public void valido_que_estou_na_tela_dynamic_data_com_sucesso() {
		assertTrue(moreLogic.validandoDynamicData());
	}
	@When("clico em more e depois clico em file Download")
	public void clico_em_more_e_depois_clico_em_file_Download() {
		moreLogic.clicandoFileDownload();

	}

	@Then("valido que estou na tela Download data com sucesso")
	public void valido_que_estou_na_tela_Download_data_com_sucesso() {
		assertTrue(moreLogic.validandoFileDownload());
	}
	@When("clico em more e depois clico em file Upload")
	public void clico_em_more_e_depois_clico_em_file_Upload() {
		moreLogic.clicandoFileUpload();

	}

	@Then("valido que estou na tela file Upload com sucesso")
	public void valido_que_estou_na_tela_file_Upload_com_sucesso() {
		assertTrue(moreLogic.validandoUpload());
	}
	
	@When("clico em more e depois clico em JQuery")
	public void clico_em_more_e_depois_clico_em_JQuery() {
		moreLogic.clicandoJQuery();

	}

	@Then("valido que estou na tela JQuery com sucesso")
	public void valido_que_estou_na_tela_JQuery_com_sucesso() {
		assertTrue(moreLogic.validandoJQuery());
	}
	@When("clico em more e depois clico em Loader")
	public void clico_em_more_e_depois_clico_em_Loader() {
		moreLogic.clicandoLoader();

	}

	@Then("valido que estou na tela Loader com sucesso")
	public void valido_que_estou_na_tela_Loader_com_sucesso() {
		assertTrue(moreLogic.validandoLoader());
}
	@When("clico em more e depois clico em modals")
	public void clico_em_more_e_depois_clico_em_modals() {
		moreLogic.clicandoModals();

	}

	@Then("valido que estou na tela modals com sucesso")
	public void valido_que_estou_na_tela_modals_com_sucesso() {
		assertTrue(moreLogic.validandoModals());
	}
	@When("clico em more e depois clico em ProgressBar")
	public void clico_em_more_e_depois_clico_em_ProgressBar() {
		moreLogic.clicandoProgressBar();

	}
	@Then("valido que estou na tela ProgressBar com sucesso")
	public void valido_que_estou_na_tela_ProgressBar_com_sucesso() {
		assertTrue(moreLogic.validandoProgressBar());
	}

}
	
	
	
