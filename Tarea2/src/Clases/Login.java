package Clases;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	public static String[] datos= {"Julio","Fernandez","201902416" };
	private JPanel contentPane;
	private JTextField txtusuario;
	private JTextField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle(" Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 336);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtusuario = new JTextField();
		txtusuario.setBackground(Color.LIGHT_GRAY);
		txtusuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtusuario.setText("");
				txtusuario.setForeground(Color.black);			
			}
		});
		
		txtusuario.setBounds(53, 123, 208, 33);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBackground(Color.LIGHT_GRAY);
		txtpassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtpassword.setText("");
				txtpassword.setForeground(Color.black);
			}
		});
		
		txtpassword.setColumns(10);
		txtpassword.setBounds(53, 181, 208, 33);
		contentPane.add(txtpassword);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(120, 48, 88, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(datos[0].equals(txtusuario.getText())   && datos[2].equals(txtpassword.getText())) {
					Bienvenida av=new Bienvenida();
					av.setVisible(true);
					Login.this.dispose();
					
				}
				else if(datos[0].equals(txtusuario.getText())   && !datos[2].equals(txtpassword.getText())) {
					System.out.println("La contraseña es incorrecta");
				}
				else if(!datos[0].equals(txtusuario.getText())   && !datos[2].equals(txtpassword.getText())) {
					System.out.println("El usuario no existe");
				}
				else if(!datos[0].equals(txtusuario.getText())   && datos[2].equals(txtpassword.getText())) {
					System.out.println("El usuario no existe");
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(110, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		txtusuario.setText("Usuario");
		txtusuario.setForeground(Color.BLACK);
		txtpassword.setText("Password");
		txtpassword.setForeground(Color.BLACK);
	}

	
	
	
	
	
	
}
