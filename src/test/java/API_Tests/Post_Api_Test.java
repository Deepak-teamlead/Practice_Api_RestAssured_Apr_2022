package API_Tests;
import API_Builders.Post_APi_Builder;
import API_Configs.Endpoints;
import API_Configs.HeaderConfigs;
import Base_Test.Base_Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
// request body for post methid is- {
//                                   "id": 20,
//                                 "title": "kgf chapter 2",
//                                  "author": "rocky bhai"
//                                  }
public class Post_Api_Test extends Base_Test {
//    @Test
//    public void postApiTest(){
//        HeaderConfigs h=new HeaderConfigs();
//        Post_APi_Builder b=new Post_APi_Builder();
//
//        Response jsonResponse = RestAssured.given()
//                .when()
//                .headers(h.defaultHeaders())
//                .body(b.postRequestBody("26","kgf chapter 2", "rocky bhai")
//       //                 .when()
//
//      //          .post(Endpoints.endpoints.CREATE_POSTS));
//
//
//     //   System.out.println(jsonResponse.prettyPrint());
//     //   System.out.println(jsonResponse.statusCode());
//
//
//
//             //   .then()
//             // .log().all()
//            // .statusCode(201);
//    ;}






}
