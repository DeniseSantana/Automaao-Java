package br.com.santander.test.steps;

import br.com.santander.test.logic.DemoLogic;
import br.com.santander.test.logic.LoginLogic;
import br.com.santander.test.sheet.model.DemoData;
import br.com.santander.test.sheet.model.LoginData;
import br.com.santander.test.support.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
	
	private DemoLogic demoLogic;
	private DemoData demoData;
	
	public DemoSteps() {
		demoLogic = new DemoLogic();  // chamamos o metodo do
		demoData = (DemoData) Context.testData();

}
	@Given("que estou na tela principal")
	public void que_estou_na_tela_principal() {
		demoLogic.navegacaodemo();
	}
	@When("seleciono a opçao skip sign e insiro meus dados válidos")
	public void seleciono_a_opçao_skip_sign_e_insiro_meus_dados_válidos() {
		demoLogic.clicandoemskipsign();
		demoLogic.criandousuario();
}
	@Then("crio usuario com sucesso")
	public void crio_usuario_com_sucesso() {
		demoLogic.validarcriacao();
}
}