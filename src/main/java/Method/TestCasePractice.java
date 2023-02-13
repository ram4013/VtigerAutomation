package Method;

import java.io.IOException;

import org.bouncycastle.asn1.cms.GenericHybridParameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestCasePractice {

	public static void main(String[] args) throws IOException {
		testcaseone();
		testcasetwo();
		testcasethree();
		
	}
		public static void testcaseone() throws IOException {
			GenericMethodsOfClass gm=new GenericMethodsOfClass();
			ExtentReports extr=gm.genaretReports("Tc001");
			gm.openBrowser("chrome");
			gm.navigateUrl("http://localhost:8888/");
			gm.validateHeight("user_name", "name", 22, "usernamebox");
			gm.validateWidth("user_name", "name", 140, "usernamebox");
			gm.validateHeight("user_password", "name", 23, "userpassword");
			gm.validateWidth("user_password", "name", 141, "userpassword");
			gm.validateHeight("Login", "name", 40, "loginButton");
			gm.validateWidth("Login", "name", 138, "loginButton");
			extr.flush();
		}
		public static void testcasetwo() throws IOException {
			GenericMethodsOfClass gm=new GenericMethodsOfClass();
			ExtentReports extr=gm.genaretReports("Tc002");
			gm.openBrowser("chrome");
			gm.navigateUrl("http://localhost:8888/");
			gm.validateXcordinate("user_name", "name", 632, "username box");
			gm.validateYcordinate("user_name", "name", 230, "username box");
			gm.validateXcordinate("user_password", "name", 632, "userpassword box");
			gm.validateYcordinate("user_password", "name", 262, "userpassword box");
			gm.validateXcordinate("Login", "name", 632, "loginButton");
			gm.validateYcordinate("Login", "name", 350, "loginButton");
			extr.flush();
		}		
		public static void testcasethree() throws IOException {			
		GenericMethodsOfClass gm =new GenericMethodsOfClass();
		ExtentReports mr=gm.genaretReports("Tc002");
		gm.openBrowser("chrome");
		gm.navigateUrl("http://localhost:8888/");
		gm.inputTextValue("admin", "user_name", "name", "username box");
		gm.inputTextValue("admin", "user_password", "name", "userpassword box");
		gm.clickMultipleElements("Login", "name", "login button");
		gm.click("Marketing", "innerTest", "marketingButton");
		gm.click("Leads", "innerTest", "leadsButton");
		gm.click("//img[@title='Create Lead...']", "xpath", "plusButton");
		gm.inputTextValue("Ramkumar", "//input[@name='firstname']", "xpath", "first name box");
		gm.inputTextValue("prajapati", "//input[@name='lastname']", "xpath", "last name box");
		gm.inputTextValue("EVS COMPANY", "//input[@name='company']", "xpath", "company name box");
		gm.inputTextValue("Task to create leads", "//input[@name='designation']", "xpath", "tital name box");
		gm.inputTextValue("ramkumar25195@gmail.com", "//input[@name='email']", "xpath", "email name box");
		mr.flush();
	}

}
