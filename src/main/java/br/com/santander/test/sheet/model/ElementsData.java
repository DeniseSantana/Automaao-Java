package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;



@Data
@Builder //(setterPrefix = "with")
public class ElementsData implements TestData {
	
	private String idcenario;
	private String fullname;
	private String email;
	private String currentaddress;   
	private String permanentaddress;
	private String firstname;
	private String lastname;
	private String age;
	private String salary;
	private String department;
	private String upload;
	
}
