import java.awt.*;

public class Main {

	public static void main(String[] args)  {
		// TODO create controller to manage the record and send back to client to send to peers

		InputController dialog = new InputController();
		dialog.setPreferredSize(new Dimension(500, 400));
		dialog.pack();
		dialog.setVisible(true);
//
//
//		Server server = new Server();
//		try {
//			server.getServerThread().start();
//			Client client = new Client();
//			client.sendRequest();
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//
//
//		// TODO: PARSE XML and SEND BACK TO PEERS
//		ParseXmlData parseXmlData = new ParseXmlData();
//		parseXmlData.parse(server.getData());
//		parseXmlData.viewRecord();





	}

}
