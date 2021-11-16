package Day14;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class useExcRW {

    public static void main(String[] args) throws IOException {
        ExcelRW excelRW = new ExcelRW("C:\\Users\\Athira.Ajayaghosh\\Selenium\\SeleniumLearning\\ExcelRW.xlsx");
        String sheetName="SearchResult";
        int rowCount = excelRW.getRowCount(sheetName);

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        for(int iRow=1;iRow<=rowCount;iRow++){

            String cellValue= excelRW.readCellValue(sheetName,iRow,0);

            driver.findElement(By.tagName("input")).sendKeys(cellValue);
            driver.findElement(By.id("sb_form_go")).submit();

            String result = driver.findElement(By.className("sb_count")).getText();
            //write to cell
            excelRW.writeCellValue(sheetName,iRow,1,result);
//            back button
            driver.navigate().to("https://www.bing.com/");
        }

        excelRW.saveAndCloseWorkbook("C:\\Users\\Athira.Ajayaghosh\\Selenium\\SeleniumLearning\\ExcelRW.xlsx");
        driver.quit();
    }

}


