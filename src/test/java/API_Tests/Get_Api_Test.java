package API_Tests;
import API_Configs.Endpoints;
import API_Configs.HeaderConfigs;
import Base_Test.Base_Test;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
public class Get_Api_Test extends Base_Test {
@Test
    public void getAPiTest1() {
    HeaderConfigs o = new HeaderConfigs();
    //
    RestAssured.given()
            .when()
            .headers(o.defaultHeaders())
            .get(Endpoints.endpoints.GET_API_LIST_OF_POSTS)
            .then()
            .log().all()
            .assertThat()
            .statusCode(200);
}
    @Test
    public void getAPiTest2() {

        Response jsonResponse = RestAssured.given().when().get(Endpoints.endpoints.GET_API_LIST_OF_POSTS);
        System.out.println(jsonResponse.getBody().asString());
        // System.out.println(jsonResponse.prettyPrint());
        System.out.println(jsonResponse.statusCode());
        System.out.println(jsonResponse.getHeaders());
        System.out.println(jsonResponse.getTime());
        System.out.println(jsonResponse.getCookies());

        String stringResponse = jsonResponse.getBody().asString();

        if (stringResponse.contains("typicode")) {
            System.out.println("text is present");
        } else {
            System.out.println("text is not prresent");
        }
    }
        @Test
        public void getAPiTest3() {

            // working with different json responses-json object and json Array
            Response jsonResponse = RestAssured.given().when().get(Endpoints.endpoints.GET_API_LIST_OF_POSTS);

            //validating Response key---json array--below line converts our response to json array
            JSONArray array = new JSONArray(jsonResponse.getBody().asString());
            //loop through array to print elements inside the a ray
            for (int i = 0; i < array.length(); i++) {
                //   System.out.println(array.get(i));
                // in above array we can validate if text is present using index numbers
                // again we need to convert json array to json object

                JSONObject obj = array.getJSONObject(i);
                System.out.println(obj.get("title"));
                if (obj.get("author").equals("typicode")) {
                    System.out.println("key and value matches---Text exists at a place");
                } else {
                    System.out.println("key and value doesnot match---Text doesnot exists at a place");
                }

            }
        }

}



