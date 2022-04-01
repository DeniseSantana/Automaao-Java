package br.com.santander.test.steps;

import br.com.santander.test.logic.SwitchLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwitchSteps {

	private SwitchLogic switchLogic;

	public SwitchSteps() {
		switchLogic = new SwitchLogic(); // chamamos o metodo do

	}

	@Given("que estou na tela switch to")
	public void que_estou_na_tela_switch_to() {
		switchLogic.navegacaodemoautomation();
	}

	@When("clico em alerts")
	public void clico_em_alerts() {
		switchLogic.clicandoAlerts();

	}

	@Then("valido que estou na tela alerts com sucesso")
	public void valido_que_estou_na_tela_alerts_com_sucesso() {
		switchLogic.validaralerts();
	}
	// CT=16

	@When("clico em alerts e depois clico em alert ok ou cancel")
	public void clico_em_alerts_e_depois_clico_em_alert_ok_ou_cancel() {
		switchLogic.clicarAlerts();

	}

	@Then("valido que estou na tela com sucesso")
	public void valido_que_estou_na_tela_com_sucesso() {
		switchLogic.validaralertsconfirmbox();
	}

	// CT=17
	@When("clico em alerts e depois clico em alert textbox")
	public void clico_em_alerts_e_depois_clico_em_alert_textbox() {
		switchLogic.clicoAlerts();

	}

	@Then("valido com sucesso que estou na pagina")
	public void valido_com_sucesso_que_estou_na_pagina() {
		switchLogic.validaralertspromptbox();
	}

	// CT=18
	@When("clico em windows")
	public void clico_em_windowa() {
		switchLogic.clicandowindows();
	}

	@Then("valido com sucesso a tela windows")
	public void valido_com_sucesso_a_tela_windows() {
		switchLogic.validandowindows();

	}

	// CT=19
	@When("clico em windows e depois clico em seperate windows")
	public void clico_em_windows_e_depois_clico_em_seperate_windows() {
		switchLogic.clicandoseperatewindows();
	}

	@Then("valido com sucesso a tela windows with")
	public void valido_com_sucesso_a_tela_windows_with() {
		switchLogic.validandoseperatewindows();
	}

	// CT=20
	@When("clico em windows e depois clico em multiplique windows")
	public void clico_em_windows_e_depois_clico_em_multiplique_windows() {
		switchLogic.clicandomultipliquewindows();
	}
	@Then("valido com sucesso a tela windows multiplique")
	public void  valido_com_sucesso_a_tela_windows_multiplique() {
		switchLogic.validandojanelaselenium();
		switchLogic.validandomultipliquewindows();
}
	// CT=21
		@When("clico em windows e depois clico em frames")
		public void clico_em_windows_e_depois_clico_em_frames() {
			switchLogic.clicandoframes();
		}
		@Then("valido com sucesso a tela frames")
		public void  valido_com_sucesso_a_tela_frames() {
			switchLogic.validarframes();
	}
}