package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ReportReader extends TestDataReader {

    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Reports\\reports.html");
    ExtentReports report = new ExtentReports();

    public void reportCreation() {
        // start reporters with configuration
        htmlReporter.config().setDocumentTitle("ExtentReports - Crested by TestNG");
        htmlReporter.config().setReportName("ExtentReports - Crested by TestNG");
        htmlReporter.config().setReportName("ExtentReports - Crested by TestNG");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setEncoding("utf-8");
    }

    public void extentReport() {
        // create ExtentReports and attach reporter(s)
        report.attachReporter(htmlReporter);
    }
}
