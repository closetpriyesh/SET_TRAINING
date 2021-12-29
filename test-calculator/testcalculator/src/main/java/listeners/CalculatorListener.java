package listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class CalculatorListener implements ITestListener {
	static 	Logger logger = Logger.getLogger(CalculatorListener.class.getName());
	
	public void onStart(ITestContext result) {
		logger.info("Test cases execution about to start....");
	}
	public void onTestFailure(ITestResult result) {
		logger.info(result.getName()+" testcase failed.");
	}

	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName()+" testcase passed.");
	}
	
	public void onFinish(ITestContext context) {
		logger.info("All test cases executed.");
	}

}
