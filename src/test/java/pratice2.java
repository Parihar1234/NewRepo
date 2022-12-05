import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class pratice2 {
	
	
	public void getInstance1() {
		
		Date date1 = new Date();
		String FDatefile = date1.toString().replace(" ","_").replace(":","_") + ".html";
		
		String Filenamepathdemo = "Reportspratice" + FDatefile;
		ExtentReports extReport = new ExtentReports(Filenamepathdemo, true, DisplayOrder.NEWEST_FIRST);
		
		File Abc = new File("ReportConfig.xml");
		extReport.loadConfig(Abc);
		

		
		
	}

}
