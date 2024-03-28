package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	
	public static ExtentReports getReportObjects() {
		String path=".\\Reports\\Accessibility_Report.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Accessibility Test Report");
		reporter.config().setDocumentTitle("Accessibility Test");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mumbai Automation Team");
		return extent;
	}
}
