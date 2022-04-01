package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;
@Data
@Builder //(setterPrefix = "with")
public class CompraData implements TestData {
	
	
	private String idcenario;
	private String usuario;
	private String senha;
	private String firstname;
	private String lastname;
	private String postalcode;
	
	
			
}
