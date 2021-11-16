package Day12;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class ExcelReadandWrite {
    public static void main(String[] args) throws IOException {

//        Open the Excel
        FileInputStream fis = new FileInputStream("C:\\Users\\Athira.Ajayaghosh\\Selenium\\SeleniumLearning\\Read_write_sample.xlsx");
//        connect the sheet
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheet("Sheet1");

//        Collect the row count
        int rowCount = sheet1.getLastRowNum();
        System.out.println(rowCount);

//      Save the excel
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Athira.Ajayaghosh\\Selenium\\SeleniumLearning\\Read_write_sample.xlsx");
        wb.write(fos);
        fis.close();
        fos.close();


//      Close the excel






    }
}
