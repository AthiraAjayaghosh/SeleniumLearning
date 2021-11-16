package Day22;
import org.testng.annotations.Test;
import java.util.Map;

public class TestScript {

    @Test(dataProvider = "LoginData",dataProviderClass = dp.class,enabled = false)
    public void getdata(String a,String b,String c,String d,String e){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    @Test(dataProvider = "LoginDataExcel",dataProviderClass = dp.class)
    public void getdata_Excel(Map<String,String> hm){
        System.out.println(hm.get("Name"));
        System.out.println(hm.get("City"));
        System.out.println(hm.get("State"));
        System.out.println(hm.get("Product"));
        System.out.println(hm.get("Country"));
    }

    @Test(dataProvider = "LoginDataHardcoded",dataProviderClass = dp.class,enabled=false)
    public void getdata_Hardcoded(Map<String,String> hm){
        System.out.println(hm.get("Name"));
        System.out.println(hm.get("City"));
        System.out.println(hm.get("State"));
    }
}
