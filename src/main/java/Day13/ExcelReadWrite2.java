package Day13;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExcelReadWrite2 {


    public static void main(String[] args) throws IOException, InterruptedException {

        //open excel
        FileInputStream fis1 = new FileInputStream("C:\\Users\\Athira.Ajayaghosh\\Selenium\\SeleniumLearning\\Read_write_sample.xlsx");
        //connect the sheet
        XSSFWorkbook wb = new XSSFWorkbook(fis1);   //connecting to the wb and get the sheet number
        XSSFSheet sheet = wb.getSheet("Sheet1");
        //collect the row count

        //String chromedriverPath = System.getProperty("C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", chromedriverPath);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
        Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //read from excel,applying and extract,writing back to excel

        int rowcount = sheet.getLastRowNum();
        for (int irow = 1; irow <=rowcount; irow++) {

            XSSFCell cell = sheet.getRow(irow).getCell(0);
            String cellvalue = "";
            if (cell.getCellType() == CellType.STRING) {
                cellvalue = cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.NUMERIC) {
                cellvalue = String.valueOf(cell.getNumericCellValue());
            } else if (cell.getCellType() == CellType.BLANK) {
                cellvalue = "";
            }
            System.out.println(cellvalue);
            driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys(cellvalue);
            driver.findElement(By.xpath("//label[@id='search_icon']")).submit();
            Thread.sleep(4000);
            String result = driver.findElement(By.className("sb_count")).getText();

            System.out.println(result);
            System.out.println(irow);
            //write to excel
            sheet.getRow(irow).getCell(1).setCellValue(result);
            Thread.sleep(1000);
            driver.navigate().to("https://www.bing.com/");  //going back
        }

        //save the sheet
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Athira.Ajayaghosh\\Selenium\\SeleniumLearning\\Read_write_sample.xlsx");
        wb.write(fos);
        fis1.close();
        fos.close();

        //close the excel
        driver.close();
    }
}


