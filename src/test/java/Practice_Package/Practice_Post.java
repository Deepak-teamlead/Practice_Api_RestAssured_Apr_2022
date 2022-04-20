package Practice_Package;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class Practice_Post {
    // This is Post request it has 2 components headers and Request Body
    // haeders may contain auth tokens
    @Test
    public void postapirequest(){
        RestAssured.baseURI ="https://reqres.in/api/users";

        RestAssured.
                given()
                .when()
                .headers("Content-Type","application/json; charset=utf-8", "Connection", "keep-alive").
                body("{\n" +
                        "    \"name\": \"morpheusss\",\n" +
                        "    \"job\": \"leaderss\"\n" +
                        "}").
                post().
                then()
                .log()
                .all()
                .assertThat().statusCode(201);

//      Response jsonresponse = RestAssured.given().post();
//      System.out.println("Status code is - " + jsonresponse.getStatusCode());
//
//       //System.out.println(jsonresponse.getBody().asString());
//       System.out.println(jsonresponse.prettyPrint());
//
//       String stringresponse = jsonresponse.getBody().asString();
//       stringresponse.contains("job");
    }
}
