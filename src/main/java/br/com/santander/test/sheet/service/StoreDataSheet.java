package br.com.santander.test.sheet.service;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.fillo.Recordset;

import br.com.santander.core.sheet.DataSheet;
import br.com.santander.core.sheet.SheetException;
import br.com.santander.core.sheet.SheetReader;
import br.com.santander.test.sheet.model.StoreData;
import br.com.santander.test.support.Context;

public class StoreDataSheet extends DataSheet {
	
	
	public StoreDataSheet() {
		this.excelFilePath = "./test-data/test-data-store.xlsx";
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

				resultsList.add(StoreData.builder() 
						.idcenario(sr.getField(recordset, "ID_CENARIO"))
						.firstname(sr.getField(recordset, "FIRST_NAME"))
						.lastname(sr.getField(recordset, "LAST_NAME"))
						.username(sr.getField(recordset, "USER_NAME"))
						.password(sr.getField(recordset, "PASSWORD"))
						.bookstore(sr.getField(recordset, "BOOK_STORE"))
						.build());
			}
		} catch (Exception e) {
			throw new SheetException(e.getMessage(), e);
		}
		return resultsList;
	}

}
