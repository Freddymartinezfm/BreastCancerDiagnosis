import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InputController extends JFrame {
	private JPanel contentPane;
	private JButton connectButton;
	private JTextArea outputArea;
	private JButton button1;


	public InputController() {
		setContentPane(contentPane);
		setVisible(true);
		go();
	}

	public void go(){
		connectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO server starts on background thread
				try {
					Server server = new Server();
					server.getServerThread().start();

					//TODO: client runs in background thread other than Server
					Client client = new Client();
					client.sendRequest();
					ParseXmlData parseXmlData = new ParseXmlData();
					parseXmlData.parse(server.getData());
					parseXmlData.viewRecord();
					for (var r : parseXmlData.getItems()){
						outputArea.setText(r.toString());
					}
				} catch (Exception ex){
					ex.printStackTrace();
				}
			}
		});


	}
}
