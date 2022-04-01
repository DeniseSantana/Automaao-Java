package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;

@Data
@Builder //(setterPrefix = "with")
public class FormsData implements TestData {
	
	private String idcenario;
	private String firstname;
	private String lastname;
	private String useremail;
	private String mobile;
	private String subjcts;
	private String currentaddress;
	private String state;
	private String city;
	private String upload;
	

}
