import org.apache.logging.log4j.Logger;
import java.io.DataOutputStream;
import java.net.Socket;
import org.apache.logging.log4j.LogManager;


public class Client  {
	public static final Logger logger = LogManager.getLogger(Client.class.getName());

	public void sendRequest() {
		logger.info("Client");
		Socket server = null;

		try {
			// TODO: implement host information to locate other peer servers to connect to
			server = new Socket("localhost", 1234);
			DataOutputStream toServer = new DataOutputStream(server.getOutputStream());
			toServer.writeBytes("<Dataset>\n" +
					"\t<id>1000025</id>\n" +
					"\t<thickness>5</thickness>\n" +
					"\t<uniformity_size>1</uniformity_size>\n" +
					"\t<uniformity_shape>1</uniformity_shape>\n" +
					"\t<adhesion>1</adhesion>\n" +
					"\t<epithelial_size>2</epithelial_size>\n" +
					"<bare_nuclei>1</bare_nuclei>\n" +
					"<chromatin>3</chromatin>\n" +
					"<nucleoli>1</nucleoli>\n" +
					"<mitoses>1</mitoses>\n" +
					"<class>2</class>\t" +
					"</Dataset>\n");
				server.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}