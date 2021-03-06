package frameworkclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class frame {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclass\\ExcelSheet\\Datas@1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//System.out.println(cell);
				
				CellType cellType = cell.getCellType();
				
				switch(cellType){
				case STRING:
					String s = cell.getStringCellValue();
					System.out.println(s);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
						
					}
					else {
					
					
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String v = b.toString();
					System.out.println(v);
					}
				default:
				break;
					
					
				}
				
				
			}
			
		}

	}

}
