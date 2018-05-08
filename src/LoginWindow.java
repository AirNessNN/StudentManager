import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class LoginWindow extends JFrame{
	private JTextField txID;
	private JTextField txPassword;
	public LoginWindow() {
		setResizable(false);
		getContentPane().setBackground(Color.PINK);
		setTitle("用户登录");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("用户名：");
		label.setBounds(131, 148, 48, 15);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(143, 183, 36, 15);
		getContentPane().add(label_1);
		
		txID = new JTextField();
		txID.setBounds(189, 145, 143, 21);
		getContentPane().add(txID);
		txID.setColumns(10);
		
		txPassword = new JTextField();
		txPassword.setBounds(189, 180, 143, 21);
		getContentPane().add(txPassword);
		txPassword.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(145, 223, 77, 41);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(243, 223, 89, 41);
		getContentPane().add(btnCancel);
	}
}
