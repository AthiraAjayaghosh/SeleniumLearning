package Day13;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExcelReadWrite {

    public static void main(String[] args) throws IOException, InterruptedException {


//        Open the Excel
        FileInputStream fis = new FileInputStream("C:\\Users\\Athira.Ajayaghosh\\Selenium\\Search.xlsx");

//        Connect the sheet
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheet("Sheet1");
        XSSFSheet sheet2 = wb.getSheet("Sheet2");

//        Collect the row count
        int rowCount = sheet1.getLastRowNum();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//        Logic -Reading from Excel,Applying it to app, Extracting value and writing it back to excel
        for(int iRow=1;iRow<=rowCount;iRow++){

//            reading from a cell
            XSSFCell cell = sheet1.getRow(iRow).getCell(0);
            String cellValue="";
            if(cell.getCellType()==CellType.STRING){
                cellValue = cell.getStringCellValue();

            }else if(cell.getCellType()==CellType.NUMERIC){
                cellValue = String.valueOf(cell.getNumericCellValue());
            }else if(cell.getCellType()==CellType.BLANK){
                cellValue="";
            }

            System.out.println(cellValue);

//           driver.findElement(By.tagName("input")).sendKeys(cellValue);
//           driver.findElement(By.id("sb_form_go")).submit();

            driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys(cellValue);
            driver.findElement(By.xpath("//label[@id='search_icon']")).submit();

            Thread.sleep(4000);
            String result = driver.findElement(By.className("sb_count")).getText();

//            Write to cell
          sheet1.getRow(iRow).getCell(1).setCellValue(result);
            Thread.sleep(1000);

//            back button
            driver.navigate().to("https://www.bing.com/");
        }

//      Save the excel
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Athira.Ajayaghosh\\Selenium\\Search.xlsx");
        wb.write(fos);

//      Close the excel
        fis.close();
        fos.close();

        driver.close();
    }

}
