import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class DocSearchTest {
    @Test
    public void testHandleRequest() throws IOException, URISyntaxException{
        Handler technical = new Handler("technical");
        URI rootPath = new URI("/404");
        assertEquals(technical.handleRequest(rootPath), "Don't know how to handle that path!");
    }
}
