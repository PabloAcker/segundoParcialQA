package api.factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class RequestGET implements IRequest{
    @Override
    public Response send(RequestInfo request) {
        Response response = given()
                .headers(request.getHeaders())
                .log().all()
                .when()
                .get(request.getHost());
        response.then().log().all();
        return response;

    }
}
