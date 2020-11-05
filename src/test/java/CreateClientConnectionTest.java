import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertNotNull;

public class ClientTest {


	@Test
	@DisplayName("Should return a new instance of a Client")
	void ClientTest(){
		Client r = new Client();
		assertNotNull(r);
	}


}
