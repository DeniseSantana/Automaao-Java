package br.com.santander.test.sheet.model;

import br.com.santander.core.sheet.TestData;
import lombok.Builder;
import lombok.Data;

@Data
@Builder //(setterPrefix = "with")
public class StoreData  implements TestData{
	
	private String idcenario;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String bookstore;

}
