import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;

public class TestBase {

    static String url = "https://reqres.in";

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI =url;
        RestAssured.basePath = "api";
        RestAssured.requestSpecification = given().accept(ContentType.ANY);
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
