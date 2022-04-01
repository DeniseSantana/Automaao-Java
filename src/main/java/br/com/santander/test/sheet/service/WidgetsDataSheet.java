package br.com.santander.test.sheet.service;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.fillo.Recordset;

import br.com.santander.core.sheet.DataSheet;
import br.com.santander.core.sheet.SheetException;
import br.com.santander.core.sheet.SheetReader;
import br.com.santander.test.sheet.model.WidgetsData;
import br.com.santander.test.support.Context;

public class WidgetsDataSheet extends DataSheet {
	
	public WidgetsDataSheet() {
		this.excelFilePath = "./test-data/test-data-widgets.xlsx";
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

				resultsList.add(WidgetsData.builder() //
						.idcenario(sr.getField(recordset, "ID_CENARIO"))//
						.multcolor(sr.getField(recordset, "MULT_COLOR"))//
						.singlecolor(sr.getField(recordset, "SINGLE_COLOR"))//
						.hover(sr.getField(recordset, "HOVER"))//
						.selectvalue(sr.getField(recordset, "SELECT_VALUE"))//
						.selectone(sr.getField(recordset, "SELECT_ONE"))//
						.selectmenu(sr.getField(recordset, "SELECT_MENU"))//
						.multselect(sr.getField(recordset, "MULTSELECT"))//
						.build());
			}
		} catch (Exception e) {
			throw new SheetException(e.getMessage(), e);
		}
		return resultsList;
	}
	
	
}
