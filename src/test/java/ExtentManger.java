import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManger {

	public static ExtentReports GetInstance() {

		/*
		 * Date date = new Date(); String CovertDT = date.toString(); String FinalDT =
		 * CovertDT.replace(" ","_").replace(":","_"); String filenametype =
		 * FinalDT+".html";
		 */

		Date date = new Date();
		String filenametype = date.toString().replace(" ", "_").replace(":", "_") + ".html";

		String reportfilepath = "reports//" + filenametype;

		ExtentReports eReport = new ExtentReports(reportfilepath, true, DisplayOrder.NEWEST_FIRST);

		File reportsconfigfile = new File("ReportsConfig.xml");

		eReport.loadConfig(reportsconfigfile);
		eReport.addSystemInfo("Testng", "6.12.0").addSystemInfo("Webdriver", "4.5.0");
		return eReport;

	}
}
