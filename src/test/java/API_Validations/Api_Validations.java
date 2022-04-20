package API_Validations;

import Java_Utils.ExtentReportListner;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;
import org.testng.Assert;

public class Api_Validations extends ExtentReportListner {
    // this class has code to validate our requests (Get or Post or Put or Delete)

    public static void responseCodeValidation(int statuscode,Response response){
        try{
            Assert.assertEquals(response.getStatusCode(),statuscode);
            test.log(LogStatus.PASS,"succesfully validated status code and status code is---"+ response.getStatusCode());
        }catch(AssertionError e){
            test.log(LogStatus.FAIL, e.fillInStackTrace());
            test.log(LogStatus.FAIL,"Expected status code is---"+statuscode , "but am getting---" +response.getStatusCode());
        }catch (Exception e){
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }




}
