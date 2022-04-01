package br.com.santander.test.steps;

import java.awt.AWTException;

import br.com.santander.test.logic.DemoLogic;
import br.com.santander.test.logic.VideoLogic;
import br.com.santander.test.sheet.model.DemoData;
import br.com.santander.test.support.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VideoSteps {
	
	private VideoLogic videoLogic;
	private DemoLogic demoLogic;
	
	public VideoSteps() {
		
		videoLogic = new VideoLogic();  // chamamos o metodo do
		demoLogic = new DemoLogic();

}
	@Given("que estou na tela principal do site")
	public void que_estou_na_tela_principal_do_site() {
		demoLogic.navegacaodemo();
	}
	@When("clico em  video e depois clico em you to be")
	public void clico_em_video_e_depois_clico_em_you_to_bo() throws AWTException {
		videoLogic.clicandonaabavideo();
		
}
	@Then("valido que estou na tela video com sucesso")
	public void valido_que_estou_na_tela_video_com_sucesso() {
		videoLogic.validartelavideo();
}
	@When("clico em video e depois clico em vimeo")
	public void clico_em_video_e_depois_clico_em_vimeo() throws AWTException {
		videoLogic.clicandonaabavimeo();
		
}
	@Then("valido que estou na tela vimeo com sucesso")
	public void valido_que_estou_na_tela_vimeo_com_sucesso() {
		videoLogic.validartelavimeo();
}
}
