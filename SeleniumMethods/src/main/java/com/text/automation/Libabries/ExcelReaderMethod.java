/**
 * 
 */
package com.text.automation.Libabries;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author nagarjuna
 *
 */
public class ExcelReaderMethod {

	public static Object[][] read_excel(String Sheet_name) throws Exception {

		FileInputStream fis = new FileInputStream("path of excel shhet");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(Sheet_name);
		int row_num = sheet.getLastRowNum();
		int col_num = sheet.getRow(0).getLastCellNum();
		Object data[][] = new Object[row_num][col_num];
		for (int i = 0; i < row_num; i++) {
			for (int j = 0; j < col_num; j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}

}
