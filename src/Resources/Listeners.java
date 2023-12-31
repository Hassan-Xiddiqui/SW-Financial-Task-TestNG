package Resources;

import Test.General.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.IOException;

public class Listeners extends BaseClass implements ITestListener {

    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReports();

    @Override
    public void onTestStart(ITestResult result) {
//        ITestListener.super.onTestStart(result);
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
//        ITestListener.super.onTestSuccess(result);
        test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        ITestListener.super.onTestFailure(result);

    }

    @Override
    public void onTestSkipped(ITestResult result) {
//        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
//        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
//        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
//        ITestListener.super.onFinish(context);
        extent.flush();
    }
}
