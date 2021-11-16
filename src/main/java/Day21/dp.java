package Day21;
import org.testng.annotations.DataProvider;

public class dp {

    @DataProvider(name="LoginData")
    public static Object[][] dataprovider(){

//       Object[][] objects = new Object[3][2];
//       objects[0][0]="Rajesh";
//       objects[0][1]="shdahd";
//       objects[1][0]="John";
//       objects[1][1]="kshdf";
//       objects[2][0]="Jim";
//       objects[2][1]="sdfdsfdsf";
//        The above code is same as below

        return new Object[][]{

                {"Rajesh","shdahd"},
                {"John","kshdf"},
                {"Jim","sdfdsfdsf"}
        };
    }
}
