package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;

@Data
@Builder //(setterPrefix = "with")
public class WidgetsData implements TestData {
	
	private String idcenario;
	private String multcolor;
	private String singlecolor;
	private String hover;
	private String selectvalue;
	private String selectone;
	private String selectmenu;
	private String multselect;
	
	

}
