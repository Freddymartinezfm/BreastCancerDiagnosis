import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	public static final Logger logger = LogManager.getLogger(Server.class);

	private Thread serverThread;
	private String xmlString;

	public Server(){
		serverThread = new Thread(this);
		xmlString = " ";
	}

	@Override
	public void run() {
		start();
	}

	public Thread getServerThread() {
		return serverThread;
	}

	public String getXmlString() {
		return xmlString;
	}

	public void start(){
		logger.info("Starting Server....in background");
		StringBuilder sb = new StringBuilder();
		try {
			//TODO: input correct port #
			ServerSocket server = new ServerSocket(1234);
			Socket client = server.accept();
			BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String line = fromClient.readLine();
			sb = new StringBuilder();
			while (!(line == null)) {
				sb.append(line.replaceAll("\t", ""));
				line = fromClient.readLine();
			}
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO: pass data to xmlParser class to convert into Record
		// TODO: save raw string as xmlstring to pass to parse xml data
		System.out.println(sb.toString().trim());
		this.xmlString = sb.toString().trim();
	}


	public String getData() {
		return this.xmlString;
	}

}
