package Practice_Package;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class Practice_Get {
    // This is Get request it has 2 components headers and Params
    @Test
    public void getapirequest(){
        RestAssured.baseURI = "https://reqres.in/api/";
        RestAssured.basePath= "users?page=2";

        RestAssured.
                given().
                when().
                headers("Content-Type","application/json; charset=utf-8", "Connection", "keep-alive").
                param("page",2).
                get(RestAssured.basePath).
                then().
                assertThat().statusCode(200);


        // Below Line is to get response into a variable
        Response jsonresponse= RestAssured.given().when().get(RestAssured.basePath);
        // Different validations in Response body
        System.out.println("Status code is- " + jsonresponse.getStatusCode());
       // System.out.println("Headrer are- " +jsonresponse.getHeaders());
        System.out.println("Cookies are- " +jsonresponse.getCookies());
        System.out.println("Content type is- " + jsonresponse.getContentType());
        System.out.println("Response Time is- " +jsonresponse.getTime());

        // converting Response Jsonbody to string. so that we can perform validations like any text contains in string etc...
        String stringresponse = jsonresponse.getBody().asString();
        if(stringresponse.contains("first_name")){
            System.out.println("Responsebody contains first_name");
        }else{
            System.out.println("Responsebody doesnot contain first_name");

        }

        //

        // Printing Responsebody in Console
        // System.out.println(jsonresponse.getBody().asString());
        System.out.println(jsonresponse.prettyPrint());
            //Our Response is coming as a Jsonobject in Jsonobject starts with curly braces EX-{"name": "item1", "description":"a JSON object"}
            // if Response comes as JsonArray it starts with square brackets Ex-[{"name":"item 1"},{"name": "item2} ]



    }
}
