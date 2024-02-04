package com.testak.SeleniumAutomationTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;


public class App 
{

//	static WebDriver driver= null;
//	
//	@Test(priority = 1)
//	public void doSetUp() {
//		System.setProperty("webdriver.chorme.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
//    	driver = new ChromeDriver();
//	}
	
//	@Test
//	public void getInput() throws EventException, IOException  {
//		
//		System.out.println("I am getInput");
//		
//		String excelFilePath = ".\\datafiles\\TestAutomation.xlsx";
//		FileInputStream fis = new FileInputStream(excelFilePath);
//		
//		XSSFWorkbook wb = new XSSFWorkbook(fis); 
//		XSSFSheet sheet =wb.getSheetAt(0);
//		
//		int rows = sheet.getLastRowNum();
//		int cols= sheet.getRow(1).getLastCellNum();
//		
//		for(int r=0;r<=rows;r++)
//		{
//			XSSFRow row=sheet.getRow(r);
//			for(int c=0;c<=cols;c++)
//			{
//				XSSFCell cell=row.getCell(c);
//				
//				switch(cell.getCellType())
//				{
//				case STRING: System.out.println(cell.getStringCellValue());break;				
//				case BOOLEAN:
//					break;
//				case NUMERIC:
//					break;				
//				default:
//					break;
//				}
//				
//			}
//			System.out.println();
//		}
//	}
//		
					
//	@Test(priority = 2)
//	public void openBrowser(){
//		driver.get("https://www.ebay.com");
//		driver.manage().window().maximize();
//	}
	
	
	
    public static void main( String[] args ) throws EncryptedDocumentException, IOException
    {
		System.out.println("I am main");
		String excelFilePath = ".\\datafiles\\TestAutomation.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sheet =wb.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		int cols= sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<=cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());break;				
				case BOOLEAN:
					break;
				case NUMERIC:
					break;				
				default:
					break;
				}
				
			}
			System.out.println();
		}
		        
    }
}
