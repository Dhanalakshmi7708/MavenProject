package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static String[][] readData() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateOpporuntity.xlsx");

		XSSFSheet ws = wb.getSheet("Sheet1"); // locate the worksheet

		int rowCount = ws.getLastRowNum();
		System.out.println("The row count is: " + rowCount);

		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The Column Count is: " + columnCount);

		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow row = ws.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				// String allData =row(1).getCell(2).getStringCellValue
				System.out.println("All data are: " + allData);
				data[i - 1][j] = allData;
			}
		}
		wb.close();
		return data;

	}
}
	