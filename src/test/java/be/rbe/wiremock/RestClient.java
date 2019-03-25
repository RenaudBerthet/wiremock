package be.rbe.wiremock;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RestClient {

    private Client client = ClientBuilder.newClient();
    private String uri;
    private int port;


    public RestClient(String uri, int port) {
        this.uri = uri;
        this.port = port;
    }

    public Greeting getBasicResponse() {
        return client
                .target("http://" + uri + ":" + port + "/json")
                .request(MediaType.APPLICATION_JSON)
                .get(Greeting.class);
    }
}
