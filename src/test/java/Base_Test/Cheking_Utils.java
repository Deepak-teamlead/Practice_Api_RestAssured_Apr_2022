package Base_Test;
import API_Configs.Endpoints;
import API_Configs.HeaderConfigs;
import Java_Utils.ExtentReportListner;
import Java_Utils.FileandEnv;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ExtentReportListner.class)
public class Cheking_Utils extends ExtentReportListner {
    @Test
   public void utilsTest() {
        // to check if we can use data from FileandEnv class
        // to check below code goto run configurations and in vmfield write -Denv=Qa and run the class
        System.out.println(FileandEnv.envandFile());
        // to check if we can use data from HeaderConfigs class
        HeaderConfigs o = new HeaderConfigs();
        System.out.println(o.defaultHeaders());
        System.out.println(o.headersWithToken());
        // to check if we can use data from Endpoints class this class has nested class
        System.out.println(Endpoints.endpoints.GET_LIST_OF_USERS);
        System.out.println(Endpoints.endpoints.CREATE_USER);
        // to check if we can use data from ExtentReportListner class...to do this first extend this class with ExtentReportListner
    }
         @Test
         public void checkExtentReportWorkingornot (){
        int a=10; int b=20;
        int sum =a+b;
         test.log(LogStatus.INFO,"Test has been started...checking ExtentReport is working or not");
         test.log(LogStatus.PASS,"My Test is passed");
         test.log(LogStatus.PASS,"sum of 2 numbers is----"+sum);
         test.log(LogStatus.INFO, "Test has been ended...checking ExtentReport is working or not");

         if(a<100){
            test.log(LogStatus.PASS,"if condition is true test-passed");
         }else{
             test.log(LogStatus.FAIL,"if condition is false test-failed");
         }

    }
}







