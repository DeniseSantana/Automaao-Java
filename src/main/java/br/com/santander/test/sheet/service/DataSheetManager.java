package br.com.santander.test.sheet.service;

import java.util.List;

import br.com.santander.core.utils.Tag;
import br.com.santander.test.support.Context;
import br.com.santander.test.support.DataTypeTag;

/**
 * Classe auxiliar centralizando a criação de todos datasheets
 *
 */
public class DataSheetManager {

	public DataSheetManager() {
	}

	/**
	 * Método para retornar os dados correspondentes ao runner, adicionar novos
	 * datasheets como um case no switch.
	 * 
	 * @param tags
	 * @return massa da planilha correspondente ao runner
	 * @throws Exception
	 */
	public Object[][] getTestData(Tag tag) {
		List<String> listTags = tag.getListTags();
		String sheetName = null;

		if (listTags.contains(DataTypeTag.LOGIN)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.LOGIN);
			Context.setSheetName(sheetName);
			return new LoginDataSheet().getTestData(sheetName); 
		}

		else if (listTags.contains(DataTypeTag.GOOGLE)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.GOOGLE);
			Context.setSheetName(sheetName);
			return new GoogleDataSheet().getTestData(sheetName);
		}
		
		else if (listTags.contains(DataTypeTag.FORMS)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.FORMS);
			Context.setSheetName(sheetName); 
			return new FormsDataSheet().getTestData(sheetName); 
		}

		else if (listTags.contains(DataTypeTag.COMPRA)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.COMPRA);
			Context.setSheetName(sheetName);
			return new CompraDataSheet().getTestData(sheetName);
		}
		else if (listTags.contains(DataTypeTag.STORE)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.STORE);
			Context.setSheetName(sheetName);
			return new StoreDataSheet().getTestData(sheetName);
		}
		else if (listTags.contains(DataTypeTag.WIDGETS)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.WIDGETS);
			Context.setSheetName(sheetName);
			return new WidgetsDataSheet().getTestData(sheetName);
		}
		
		else if (listTags.contains(DataTypeTag.ELEMENTS)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.ELEMENTS);
			Context.setSheetName(sheetName); 
			return new ElementsDataSheet().getTestData(sheetName);
		}
		else if (listTags.contains(DataTypeTag.SHOPEE)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.SHOPEE);
			Context.setSheetName(sheetName); 
			return new ShopeeDataSheet().getTestData(sheetName);
		}

		else if (listTags.contains(DataTypeTag.API)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.API);
			Context.setSheetName(sheetName);
			return new RestDataSheet().getTestData(sheetName);
		}
		else if (listTags.contains(DataTypeTag.DEMO)) {
			sheetName = tag.convertTagToSimpleName(DataTypeTag.DEMO);
			Context.setSheetName(sheetName);
			return new DemoDataSheet().getTestData(sheetName);
		}
		else {
			throw new RuntimeException("Planilha de massa " + (sheetName == null ? "" : sheetName + " ")
					+ "não encontrada, verificar tags da classe Runner");
		}
	}
}
