package Base_Test;

import Java_Utils.FileandEnv;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class Base_Test {

@BeforeClass
    public void baseTest(){

    RestAssured.baseURI ="http://localhost:3000/";


   // RestAssured.baseURI = FileandEnv.envandFile().get("serverUrl");

}
}
