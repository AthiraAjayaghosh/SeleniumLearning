package Framework.DataProviders;
import org.testng.annotations.DataProvider;

public class Dp_Login {

    @DataProvider(name="InvalidLoginData")
    public static Object[][] dataprovider(){
        return new Object[][]{

                {"Rajesh","shdahd"},
                {"John","kshdf"},
                {"Jim","sdfdsfdsf"}
        };

    }
}
