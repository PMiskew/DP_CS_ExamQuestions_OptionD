package sample_IA_A_2;
//In this stage we just build this window, we don't actually link 
//it into our program.  That will happen in stage 3.  The goal here 
//is to prototype and get the window up and running. 

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class NewUser {

	//DATA
	private ArrayList<String> users = new ArrayList<String>();
	private ArrayList<char[]> passwords = new ArrayList<char[]>();
	
	//GUI
	private JFrame frame = new JFrame("New User Window");
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Enter Information:");
	private JLabel userName = new JLabel("User Name:");
	private JLabel password = new JLabel("Password:");
	private JLabel passwordConfirm = new JLabel("Password Confirm:");
	private JTextField userField= new JTextField("",20);
	private JPasswordField passField = new JPasswordField("",20);
	private JPasswordField passFieldConfirm = new JPasswordField("",20);
	
	private JButton submit = new JButton("SUBMIT");
	
	//LISTENERS
	private ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		

			String myPass=String.valueOf(passField.getPassword());
			String myPassConfirm=String.valueOf(passFieldConfirm.getPassword());
			String user = userField.getText();
			
			//System.out.println(user);
			if (myPass.equals(myPassConfirm) && isValid(myPass)) {
				
				for (int i = 0; i < users.size(); i = i + 1) {
					if (users.get(i).equals(user)) {
						JOptionPane.showMessageDialog(null, "Invalid User");
						clearFields();
						return; 
					}
				}
				
				users.add(user);
				passwords.add(passField.getPassword());
				JOptionPane.showMessageDialog(null, "Added to System");
				clearFields();
				showUsers();
				showPasswords();
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Passwords Invalid");
				clearFields();
			}
			
		}
	
	
	};
	
	WindowListener wl = new WindowListener() {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			  
			int x = JOptionPane.showConfirmDialog(null, 
	                    "Are you sure you want to exit ?", "Comform !",
	                    JOptionPane.YES_NO_OPTION);

	                if(x == JOptionPane.YES_OPTION) {
	                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                }else{
	                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	                }
	            
	        
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
        
	};
	
	public NewUser() {
		
		panel.setBorder(new EmptyBorder(20,20,20,20));
		panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
		panel.add(userName,gbc);
		panel.add(userField,gbc);
	
		panel.add(password,gbc);
		panel.add(passField,gbc);
		
		panel.add(passwordConfirm,gbc);
		panel.add(passFieldConfirm,gbc);
		
		panel.add(submit,gbc);
		submit.addActionListener(action);
		
		frame.add(panel);
		frame.pack();

		frame.addWindowListener(wl);
		frame.setVisible(true);
	}
	
	public void clearFields() {
		userField.setText("");
		passField.setText("");
		passFieldConfirm.setText("");
	}
	
	private void showUsers() {
		System.out.println(users);
	}
	
	private void showPasswords() {
		for (int i = 0; i < passwords.size(); i = i + 1) {
			System.out.println(Arrays.toString(passwords.get(i)));
		}

	}
	
	private boolean isValid(String pass) {
		//This is where you could write code to check password security.
		return true;
	}
	public static void main(String[] args) {
		
		//This is simply to test that the window works. 
		NewUser nu = new NewUser();
		
	}
}
