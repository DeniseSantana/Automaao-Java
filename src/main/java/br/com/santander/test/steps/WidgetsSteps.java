package br.com.santander.test.steps;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import br.com.santander.test.logic.WidgetsLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WidgetsSteps {

	private WidgetsLogic widgetsLogic;
	
	
	public WidgetsSteps() {
		widgetsLogic = new WidgetsLogic();
}
	//CT=200
	
		@Given("que estou na tela Principal")
		public void que_estou_na_tela_Principal() {
			widgetsLogic.navegacaodemoqademoautomationtesting();
		}
		@When("seleciono a opção widgets e depois Accordion")
		public void seleciono_a_opção_widgets_e_depois_Accordion() {
		   widgetsLogic.acessaraccordion();
		}
		@Then("valido a seleção do Accordion")
		public void valido_a_seleção_do_Accordion() {
			assertTrue(widgetsLogic.Validaraccordion());

	}
		
	//CT=201
		
		@When("seleciono a opção widgets e depois AutoComplete")
		public void seleciono_a_opção_widgets_e_depois_AutoComplete() {
		   widgetsLogic.acessarAutoComplete();
			
		}
		@Then("valido a seleção do AutoComplete")
		public void valido_a_seleção_do_AutoComplete() {
			assertTrue(widgetsLogic.ValidarAutoComplete());

	}
		
	//CT=202
		
		@When("seleciono a opção widgets e depois DataPicker e preencho os campos")
		public void seleciono_a_opção_widgets_e_depois_DataPicker_e_preencho_os_campos() {
				 
			widgetsLogic.acessarDataPicker();
				}
		@Then("valido a seleção do DataPicker")
		public void valido_a_seleção_do_DataPicker() {
			assertTrue(widgetsLogic.ValidarAutoComplete());

	}
		
		//CT=203
		
				@When("seleciono a opção widgets e depois Slider e interajo")
				public void seleciono_a_opção_widgets_e_depois_Slider_e_interajo() throws AWTException {
						 
					widgetsLogic.acessarSlider();
						}
				@Then("valido a seleção do Slider")
				public void valido_a_seleção_do_Slider() {
					assertTrue(widgetsLogic.ValidarAutoComplete());

			}
	
}
