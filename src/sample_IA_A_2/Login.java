package sample_IA_A_2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//SAMPLE IA_A
public class Login {

	private JFrame frame = new JFrame("Login");
	private JPanel panel = new JPanel();
	
	private JLabel loginL = new JLabel("Login");
	private JLabel pwordL = new JLabel("Password");
	private JLabel resultL = new JLabel("");
	
	private JTextField loginENT = new JTextField();
	private JPasswordField pwordENT = new JPasswordField();
	
	private JButton loginBTN = new JButton("Login");
	private JButton newUserBTN = new JButton ("New User");
	
	private Controller control;
	
	private ActionListener loginLSN = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String u = loginENT.getText();
			char[] pwd = pwordENT.getPassword();
			
			int result = control.checkpasswordNONALPHA(u,pwd);
			System.out.println(result);
			if (result == 0) {
				resultL.setText("Login Valid");
			}
			else if (result == 1) {
				resultL.setText("Invalid Password");	
			}
			else {
				resultL.setText("Invalid User");
			}
		}
		
		
	};
	
	public Login(Controller c) {
		
		control = c;
		
		//configure elements
		loginENT.setColumns(20);
		pwordENT.setColumns(20);
		loginBTN.addActionListener(loginLSN);
		
		//setup panel
		panel.add(loginL);
		panel.add(loginENT);
		panel.add(pwordL);
		panel.add(pwordENT);
		panel.add(loginBTN);
		panel.add(newUserBTN);
		panel.add(resultL);
		
		//set up frame
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
