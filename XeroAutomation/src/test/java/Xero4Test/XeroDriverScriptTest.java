package Xero4Test;



import java.lang.reflect.Method;

			
public class XeroDriverScriptTest extends AutomationXero{
	public static void mainMethod() throws Exception{
		//String cur_dir=System.getProperty("user.dir");
		String dt_Path = "C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\Utility\\Xero.xlsx";
		String testCase ;
		String flag;
		
		initializeExtentReport("XeroTestscriptsReport");
		String[][] TestSuitedata = readxlData(dt_Path,"Sheet1");
		for(int i = 1; i< TestSuitedata.length; i++) {
			flag = TestSuitedata[i][1];
			if(flag.equalsIgnoreCase("Y")) {
					testCase = TestSuitedata[i][0];
					Method testScript = AutomationXero.class.getMethod(testCase);
					testScript.invoke(testScript);
					
				}else {
					System.out.println("**********Row  number "+ i+" test case Name "+ TestSuitedata[i][0]+" is not Executed*********");
				}
				
			
			
			
		}
		 
		
		endExtentReport();
	}

}
