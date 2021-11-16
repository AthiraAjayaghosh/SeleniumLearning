package Framework.Commons;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import static Framework.Constants.ApplicationConstants.REPORT_PATH;

public class ReportUtil {
    private static ReportUtil eReports=null;
    private static ExtentReports extentReports;

    private ReportUtil(){
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\Report.html");
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(System.getProperty("user.dir") + "\\Reports");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter,extentLoggerReporter);
    }

    public static ExtentReports getReport(){
        if(eReports==null){
            eReports=new ReportUtil();
        }
        return extentReports;
    }


    public static void pass(ExtentTest test, String Details){
        test.pass(Details);
    }

    public static void pass(ExtentTest test, String Details,String getScreenShotPath){
        try {
            test.pass(Details);
            test.pass("", MediaEntityBuilder.createScreenCaptureFromPath(getScreenShotPath.replace(REPORT_PATH + "\\", "")).build());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void fail(ExtentTest test, String Details){
        test.fail(Details);
    }

    public static void fail(ExtentTest test, String Details,String getScreenShotPath){
        try {
            test.fail(Details);
            test.fail("", MediaEntityBuilder.createScreenCaptureFromPath(getScreenShotPath.replace(REPORT_PATH + "\\", "")).build());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
