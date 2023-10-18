package api.factoryRequest;

import java.util.HashMap;
import java.util.Map;
public class FactoryRequest {
    private static Map<String, IRequest> requestMap = new HashMap<>();

    public static IRequest make(String type) {
        requestMap.put("put", new RequestPUT());
        requestMap.put("post", new RequestPOST());
        requestMap.put("get", new RequestGET());
        requestMap.put("delete", new RequestDELETE());

        return requestMap.containsKey(type.toLowerCase())?
                requestMap.get(type.toLowerCase()):
                requestMap.get("get");
    }
}
