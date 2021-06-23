package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.Testbase;

public class testUtil  extends Testbase{

	
	public String switchtochild() {
		Set<String> a = driver.getWindowHandles();
		Iterator<String> it = a.iterator();
	      String chlwnd = it.next();
	      String pwnd = it.next();
	      // switch to child window
	      driver.switchTo().window(chlwnd);
	     String Page_title = driver.getTitle();
	     return Page_title;}
	
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\kiran\\eclipse-workspace\\org.project.zerodha\\src\\main\\java\\testdata\\testdata.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	      

public  static void takeScrenshotAtEndofTest() throws IOException {
	  File i =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     System.out.println(i);
	   //  Date d = new Date();
	     String timestamp = new SimpleDateFormat("yyyy_MM_dd").format(new Date());

	     File dest=new File("F:\\velocity 27 FEB 2021\\"+timestamp +".png");
	     
	     FileHandler.copy(i, dest);
	     
	     
}
}