package api.factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class RequestDELETE implements IRequest{
    @Override
    public Response send(RequestInfo request) {
        Response response = given()
                .headers(request.getHeaders())
                .log().all()
                .when()
                .delete(request.getHost());
        response.then().log().all();
        return response;

    }
}
