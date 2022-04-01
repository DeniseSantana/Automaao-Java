package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;

@Data
@Builder // (setterPrefix = "with")
public class DemoData implements TestData{

	private String idcenario;
	private String firstname;
	private String lastname;
	private String adress;
	private String email;
	private String phone;
	private String password;
	private String confirmpassword;
	private String upload;
}
