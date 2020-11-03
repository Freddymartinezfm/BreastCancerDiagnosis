import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class InputController extends JFrame {
	private JPanel contentPane;
	private JTextField textField1;
	private JButton connectButton;
	private JTextField output;
	private JButton resultsBtn;

	public InputController(){
		setContentPane(contentPane);

		setVisible(true);




		connectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Server server = new Server();
				try {
					server.getServerThread().start();
					Client client = new Client();
					client.sendRequest();
					ParseXmlData parseXmlData = new ParseXmlData();
					parseXmlData.parse(server.getData());
					parseXmlData.viewRecord();

					for (var r : parseXmlData.getItems()){
						output.setText(r.toString());
					}
				} catch (Exception ex){
					ex.printStackTrace();
				}






			}
		});


		resultsBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {






			}
		});



	}






}
