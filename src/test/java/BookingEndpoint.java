import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class BookingEndpoint {
    private final String BASE_URL = "https://restful-booker.herokuapp.com";


    public void getAllBooking() {
        RestAssured.baseURI = BASE_URL;

        given()
                .header("Accept", "*/*")
                .when()
                .get("/booking/")
                .then()
                .statusCode(200)
                .log().all();
    }


}
