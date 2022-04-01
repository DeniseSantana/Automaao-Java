package br.com.santander.test.steps;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import br.com.santander.test.logic.DemoLogic;
import br.com.santander.test.logic.VideoLogic;
import br.com.santander.test.logic.WysiLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WysiSteps {

	private WysiLogic wysiLogic;
	private DemoLogic demoLogic;

	public WysiSteps() {

		wysiLogic = new WysiLogic(); // chamamos o metodo do
		demoLogic = new DemoLogic();
	}

	@Given("que estou na tela principal wysiwig")
	public void que_estou_na_tela_principal_wysiwig() {
		demoLogic.navegacaodemo();
	}

	@When("clico em  wysiwig e depois clico em tinymce")
	public void clico_em_wysiwig_e_depois_clico_em_tinymce() throws AWTException {
		wysiLogic.clicandoTinyMCE();

	}

	@Then("valido que estou na pagina wysiwig com sucesso")
	public void valido_que_estou_na_pagina_wysiwig_com_sucesso() {
		wysiLogic.validandotelatinymce();
	}

	@When("clico em wysiwyg e depois clico em ckeditor")
	public void clico_em_wysiwyg_e_depois_clico_em_ckeditor() {
		wysiLogic.clicandoCkeditor();
	}

	@Then("valido que estou na pagina ckeditor com sucesso")
	public void valido_que_estou_na_pagina_ckeditor_com_sucesso() {
		assertTrue(wysiLogic.validarCkeditor());
	}

	@When("clico em wysiwyg e depois clico em summernote")
	public void clico_em_wysiwyg_e_depois_clico_em_summernote() {
		wysiLogic.AcessarSummer();
	}
	@Then("valido que estou na pagina summernote com sucesso")
	public void valido_que_estou_na_pagina_summernote_com_sucesso() {
		assertTrue(wysiLogic.validarSummer());
}
	@When("clico em wysiwyg e depois clico em codemirror")
	public void  clico_em_wysiwyg_e_depois_clico_em_codemirror() {
		wysiLogic.AcessarCodeMirror();
	}
	@Then("valido que estou na pagina codemirror com sucesso")
	public void valido_que_estou_na_pagina_codemirror_com_sucesso() {
		assertTrue(wysiLogic.ValidarCodeMirror());
}
}