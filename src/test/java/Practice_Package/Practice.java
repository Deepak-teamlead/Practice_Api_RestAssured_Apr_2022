package Practice_Package;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class Practice {
    //get request https://reqres.in/api/users?page=2

    @Test
    public void getapi() {
        RestAssured.baseURI ="https://reqres.in/";
        RestAssured.basePath ="api/users?page=2";

//        RestAssured.given()
//                .when()
//                .headers("Content-Type","application/json; charset=utf-8","Server","cloudflare")
//                .params("page",2)
//                .get(RestAssured.basePath)
//                .then()
//                .assertThat()
//                .log().all()
//                .statusCode(200);


        Response jsonrespone = RestAssured.given().when().get(RestAssured.basePath);
       // System.out.println(jsonrespone.headers());
       // System.out.println(jsonrespone.getBody().asString());
        System.out.println(jsonrespone.prettyPrint());
        System.out.println(jsonrespone.statusCode());
        System.out.println(jsonrespone.getStatusCode());
        System.out.println(jsonrespone.getCookies());
        System.out.println(jsonrespone.getTime());

        String stringresponse = jsonrespone.getBody().asString();

        if(stringresponse.contains("avatar")){
            System.out.println("text is present");
        }else{
            System.out.println("text is not present");
        }
    }

    //post request https://reqres.in/api/users

    @Test
    public void post(){
        RestAssured.baseURI ="https://reqres.in/api/users";

        RestAssured.given()
                .when()
                .headers("CF-Cache-Status","DYNAMIC","Server","cloudflare")
                .body("{\n" +
                        "\"name\": \"morpheusssss\",\n" +
                        "\"job\": \"leadersss\"\n" +
                        "}")
                .post()
                .then()
                .assertThat()
                .log().all()
                .statusCode(201);

//        String postbody = "{\n" +
//                "\"name\": \"morpheussssss\",\n" +
//                "\"job\": \"leaderssss\"\n" +
//                "}";
//        Response jsonrespone = RestAssured.given().when().body(postbody).post();
//        System.out.println(jsonrespone.prettyPrint());


    }

// To Start JSON Server use this command in terminal- json-server --watch db.json






    }



