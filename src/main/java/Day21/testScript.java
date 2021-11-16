package Day21;
import org.testng.annotations.Test;

public class testScript {

    @Test(dataProvider = "LoginData",dataProviderClass =dp.class )
    public void getUSernamePassword(String Username, String Password ){

    }
}
