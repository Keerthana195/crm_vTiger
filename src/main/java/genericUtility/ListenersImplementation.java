package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	ExtentReports reports;
	ExtentTest test;
	JavaUtility jutil = new JavaUtility();
	String dateTimeStamp = jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On test start executed");
		//Creating fields for every @Test method in the report
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On test success executed");
		//Logging the status as PASS for the @Test method
		test.log(Status.PASS, methodName+"--successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On test failure executed");
	
		//Logging the status as failed
		test.log(Status.FAIL, methodName+"--failed");
		test.log(Status.INFO, result.getThrowable());
		
		//capturing the screenShot of the web page
		String screenshotName = methodName+"-"+dateTimeStamp;
		SeleniumUtility sutil = new SeleniumUtility();
		try {
			String path = sutil.webpageScreenshot(BaseClass.sDriver, screenshotName);
			//attaching the screenshot to the failed test in report
			test.addScreenCaptureFromPath(path);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On test skipped executed");
		//Logging the status as SKip
	    test.log(Status.SKIP, methodName+"--skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start excectued");
		//Configuring the Extent Report
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent_Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("Vtiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Generate an empty report
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888");
		reports.setSystemInfo("Base browser", "chrome");
		reports.setSystemInfo("Base platform", "Windows");
		reports.setSystemInfo("Test Engineer", "Keerthana");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish excectued");
		reports.flush();
	}
	

}
