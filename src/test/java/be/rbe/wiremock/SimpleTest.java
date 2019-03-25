package be.rbe.wiremock;

import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class SimpleTest {


    public static final String WIREMOCK_HOST = "localhost";
    public static final int WIREMOCK_PORT = 15421;
    RestClient restClient = new RestClient(WIREMOCK_HOST, WIREMOCK_PORT);

    @BeforeEach
    void setUp() {
        configureFor(WIREMOCK_HOST, WIREMOCK_PORT);
        stubFor(get(urlEqualTo("/json"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"message\":\"hello\"}")));
    }

    @Test
    void someTest() {
        System.out.println(restClient.getBasicResponse());
    }

    @AfterEach
    void tearDown() {
        WireMock.reset();
    }

}
