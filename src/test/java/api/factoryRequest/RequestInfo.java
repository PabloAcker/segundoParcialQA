package api.factoryRequest;

import java.util.HashMap;
import java.util.Map;

public class RequestInfo {
    private String host;
    private String body;
    private Map<String, String> headers = new HashMap<>();

    public String getHost() {
        return host;
    }

    public RequestInfo setHost(String host) {
        this.host = host;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RequestInfo setBody(String body) {
        this.body = body;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public RequestInfo setHeader(String key, String value) {
        this.headers.put(key,value);
        return this;
    }
}
