package Day22;

import Day14.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;
public class dp {

    //1.Object[][]
//2. Iterator<Object[]>

    @DataProvider(name="LoginData")
    public static Object[][] dataprovider(){

//        Object[][] objects = new Object[3][2][1];
//        objects[0][0]="Rajesh";
//        objects[0][1]="shdahd";
//        objects[1][0]="John";
//        objects[1][1]="kshdf";
//        objects[2][0]="Jim";
//        objects[2][1]="sdfdsfdsf";

        return new Object[][]{

                {"Rajesh","shdahd","Hi","hello","Tata"},
                {"John","kshdf","Hi","hello","Tata"},
                {"Jim","sdfdsfdsf","Hi","hello","Tata"}
        };

    }

    @DataProvider(name="LoginDataExcel")
    public static Iterator<Object[]> dataprovider_Excel() throws IOException {

//        Read values from each row of excel
        String sheetName = "Sheet1";
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData.xlsx");
        int rowCount = excelRW.getRowCount(sheetName);
        int columnCount = excelRW.getColumnCount(sheetName);
        //        Create a index in List
        ArrayList<Object[]> list = new ArrayList<Object[]>();

        for(int iRow = 1;iRow<=rowCount;iRow++){
            Object[] obj = new Object[1];
            //        In that object array , create a Map
            Map<String, String> map = new HashMap<>();

            for(int iCol=0;iCol<columnCount;iCol++){

                String key = excelRW.readCellValue(sheetName, 0, iCol);
                String value= excelRW.readCellValue(sheetName,iRow,iCol);
                //        in that map , add all the values from the row as Key Value pair
                map.put(key,value);
            }
            obj[0] = map;
            //        IN that location I should add a new Object array
            list.add(obj);

        }
        return list.iterator();

    }


    @DataProvider(name="LoginDataHardcoded")
    public static Iterator<Object[]> dataprovider_harcoded() throws IOException {

        return Arrays.asList(new Object[]{
                        new HashMap<String,String>(){{
                            put("Name","John");
                            put("City","CA");
                            put("State","NewYork");
                        }}
                }
                ,new Object[]{
                        new HashMap<String,String>(){{
                            put("Name","Rajesh");
                            put("City","Bangalore");
                            put("State","California");
                        }}}).iterator();


    }

}
