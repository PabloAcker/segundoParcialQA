package api.apiTest.filaC;

import api.config.Configuration;
import api.factoryRequest.FactoryRequest;
import api.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.Random;

import static org.hamcrest.Matchers.equalTo;

public class Ejercicio2 {
    RequestInfo requestInfo = new RequestInfo();
    Response response;
    JSONObject body = new JSONObject();
    String auth;
    private static Random rand = new Random();
    // user = "pablo"+rand.nextInt(1000)+"@pablo.com";
    String[] users = {
            "pablo@pablo1.com",
            "pablo@pablo2.com",
            "pablo@pablo3.com",
            "pablo@pablo4.com"
    };

    @BeforeEach
    public void setup(){
        auth = Base64.getEncoder().encodeToString((users[0]+":"+Configuration.password).getBytes());
    }

    @Test
    public void verifyCreate4UserAndDelete(){
        for(int i = 0; i<4; i++){
            //Create User
            body.clear();
            body.put("Email", users);
            body.put("Password", Configuration.password);
            body.put("FullName", "PabloAckerM");
        }
        requestInfo.setHost(Configuration.host+"api/user.json").setBody(body.toString());
        response = FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Email", equalTo(body.get("Email")))
                .body("FullName", equalTo(body.get("FullName")));

        String token = response.then().extract().path("TokenString");

        //Delete User/token
        JSONArray jsonArray = new JSONArray(response.body().print());
        for(int i = 0; i<jsonArray.length(); i++){
            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
            requestInfo.setHost(Configuration.host+"api/authentication/token.json").setHeader("Token", token);
            response = FactoryRequest.make("delete").send(requestInfo);
            response.then()
                    .log().all()
                    .statusCode(200)
                    .body("TokenString", equalTo(token))
                    .body("Deleted", equalTo(true));
        }
    }
}
