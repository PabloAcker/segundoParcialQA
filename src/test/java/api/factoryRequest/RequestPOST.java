package api.factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class RequestPOST implements IRequest{
    @Override
    public Response send(RequestInfo request) {
        Response response = given()
                .headers(request.getHeaders())
                .body(request.getBody())
                .log().all()
                .when()
                .post(request.getHost());
        response.then().log().all();
        return response;
    }
}
