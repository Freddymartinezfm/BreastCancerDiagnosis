public class Main {
	public static void main(String[] args)  {
		// TODO create controller to manage the record and send back to client to send to peers
		Server server = new Server();
		try {
			server.getServerThread().start();
			Client client = new Client();
			client.sendRequest();
		} catch (Exception e){
			e.printStackTrace();
		}


		// TODO: PARSE XML and SEND BACK TO PEERS
		ParseXmlData parseXmlData = new ParseXmlData();
		parseXmlData.parse(server.getData());
		parseXmlData.viewRecord();





	}

}
