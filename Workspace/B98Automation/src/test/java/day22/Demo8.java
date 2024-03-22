package day22;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo8 {

	public static void main(String[] args) {
		
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		ExtentTest t1 = extent.createTest("MyTest1");
		
		t1.log(Status.PASS, "This is pass");
		
		ExtentTest t2 = extent.createTest("MyTest2");
		
		t2.log(Status.INFO, "This is INFO");
		t2.log(Status.WARNING, "This is WARNING");
		t2.log(Status.SKIP, "This is SKIP");
		t2.log(Status.FAIL, "This is FAIL");
		
		extent.flush(); //generate report
		
		System.out.println("End");
	}

}
