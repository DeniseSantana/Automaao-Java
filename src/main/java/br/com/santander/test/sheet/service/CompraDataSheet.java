package br.com.santander.test.sheet.service;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.fillo.Recordset;

import br.com.santander.core.sheet.DataSheet;
import br.com.santander.core.sheet.SheetException;
import br.com.santander.core.sheet.SheetReader;
import br.com.santander.test.sheet.model.CompraData;
import br.com.santander.test.support.Context;

public class CompraDataSheet extends DataSheet {

	public CompraDataSheet() {
		this.excelFilePath = "./test-data/test-data-compra.xlsx";
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

				resultsList.add(CompraData.builder() //
						.idcenario(sr.getField(recordset, "ID_CENARIO"))//
						.usuario(sr.getField(recordset, "USUARIO"))//
						.senha(sr.getField(recordset, "SENHA"))//
						.firstname(sr.getField(recordset, "FIRST_NAME"))//
						.lastname(sr.getField(recordset, "LAST_NAME"))//
						.postalcode(sr.getField(recordset, "POSTAL_CODE"))//
						.build());
			}
		} catch (Exception e) {
			throw new SheetException(e.getMessage(), e);
		}
		return resultsList;
	}
}
