package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;


@Data
@Builder //(setterPrefix = "with")
public class ShopeeData implements TestData {
	
	private String idcenario;
	private String login;
	private String senha;
	
}
