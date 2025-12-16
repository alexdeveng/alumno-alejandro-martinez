package api;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class GreetingApiTest {

    @Test
    void buildMessage_empiezaPorEtiquetaApi() {
        GreetingApi api = new GreetingApi();
        String msg = api.buildMessage("Jose");
        assertTrue(msg.startsWith("[API] "));
    }
}
