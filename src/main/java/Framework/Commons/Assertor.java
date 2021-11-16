package Framework.Commons;

import com.aventstack.extentreports.ExtentTest;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class Assertor extends SoftAssert {

    private  ExtentTest test;

    public Assertor(ExtentTest test){
        this.test=test;
    }

    @Override
    public void onAssertSuccess(IAssert<?> assertCommand) {
        if(assertCommand.getMessage().contains("#")){
            Logutil.info(assertCommand.getMessage().split("#")[0]);
            ReportUtil.pass(test,assertCommand.getMessage().split("#")[0],assertCommand.getMessage().split("#")[1].trim());
        }else{
            ReportUtil.pass(test,assertCommand.getMessage());
        }
    }

    @Override
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        if(ex.getMessage().contains("#")){
            Logutil.error(ex.getMessage().split("#")[0]);
            ReportUtil.fail(test,ex.getMessage().split("#")[0],ex.getMessage().split("#")[1].split("expected")[0].trim());
        }else{
            Logutil.error(ex.getMessage());
            ReportUtil.fail(test,ex.getMessage());
        }

    }

}
