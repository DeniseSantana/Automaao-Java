package br.com.santander.test.sheet.service;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.fillo.Recordset;

import br.com.santander.core.sheet.DataSheet;
import br.com.santander.core.sheet.SheetException;
import br.com.santander.core.sheet.SheetReader;
import br.com.santander.test.sheet.model.ElementsData;
import br.com.santander.test.support.Context;

public class ElementsDataSheet extends DataSheet {
	
	
	
	public ElementsDataSheet() {
		this.excelFilePath = "./test-data/test-data-elements.xlsx";
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

				resultsList.add(ElementsData.builder() //
						.idcenario(sr.getField(recordset, "ID_CENARIO"))//
						.fullname(sr.getField(recordset, "FULL_NAME"))//
						.email(sr.getField(recordset, "EMAIL"))//
						.currentaddress(sr.getField(recordset, "CURRENT_ADDRESS"))//
						.permanentaddress(sr.getField(recordset, "PERMANENT_ADDRESS"))//
						.firstname(sr.getField(recordset, "FIRST_NAME"))//
						.lastname(sr.getField(recordset, "LAST_NAME"))//
						.age(sr.getField(recordset, "AGE"))
						.salary(sr.getField(recordset, "SALARY"))
						.department(sr.getField(recordset, "DEPARTMENT"))
						.upload(sr.getField(recordset, "UPLOAD"))
						.build());
			}
		} catch (Exception e) {
			throw new SheetException(e.getMessage(), e);
		}
		return resultsList;
	
	}
}
