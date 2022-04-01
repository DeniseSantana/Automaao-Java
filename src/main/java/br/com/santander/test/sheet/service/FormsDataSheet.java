package br.com.santander.test.sheet.service;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.fillo.Recordset;

import br.com.santander.core.sheet.DataSheet;
import br.com.santander.core.sheet.SheetException;
import br.com.santander.core.sheet.SheetReader;
import br.com.santander.test.sheet.model.FormsData;
import br.com.santander.test.support.Context;

public class FormsDataSheet extends DataSheet {
	
	public FormsDataSheet() {
		this.excelFilePath = "./test-data/test-data-forms.xlsx";
	}
	
	@Override
	public Object[][] getTestData(String sheetName) {
		// String idUsuario = getTestDataListField(sheetName, "select * from " +
		// sheetName + " where ID_CENARIO = '" + Context.getIdScenario() + "'",
		// "ID_USUARIO");
		return getTestData(sheetName,
				"select * from " + sheetName + " where ID_CENARIO = '" + Context.getIdScenario() + "'");
	}
	
	@Override
	protected List<Object> parseRecordsToDataObjectList(Recordset recordset, ArrayList<String> list) {
		List<Object> resultsList = new ArrayList<>();

		try (SheetReader sr = new SheetReader(excelFilePath);) {
			while (recordset.next()) {

				resultsList.add(FormsData.builder() //
						.idcenario(sr.getField(recordset, "ID_CENARIO"))//
						.firstname(sr.getField(recordset, "FIRST_NAME"))//
						.lastname(sr.getField(recordset, "LAST_NAME"))//
						.useremail(sr.getField(recordset, "USER_EMAIL"))//
						.mobile(sr.getField(recordset, "MOBILE_NUMBER"))//
						.subjcts(sr.getField(recordset, "SUBJCTS"))//
						.state(sr.getField(recordset, "STATE"))//
						.city(sr.getField(recordset, "CITY"))//
						.currentaddress(sr.getField(recordset, "CURRENT_ADDRES"))//
						.upload(sr.getField(recordset, "UPLOAD"))//
						.build());
			}
		} catch (Exception e) {
			throw new SheetException(e.getMessage(), e);
		}
		return resultsList;
	
	
	
	
	}	

}
