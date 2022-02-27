package Clases;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Bienvenida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
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
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 585);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
	
		
		
		
		
		//ImageIcon imagen=new ImageIcon("Logo_Perfil.png");
		//JLabel usac = new JLabel();
		//usac.setBounds(10, 11, 195, 68);
		//usac.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(usac.getWidth(), usac.getHeight(), Image.SCALE_SMOOTH)));
		//contentPane.add(usac);
		
		JLabel txtnombre = new JLabel();
		txtnombre.setFont(new Font("Cooper Black", Font.BOLD, 20));
		txtnombre.setText(Login.datos[0]);
		txtnombre.setBounds(432, 267, 74, 40);
		contentPane.add(txtnombre);
		
		
		
		ImageIcon image=new ImageIcon("User.png");
		JLabel profile = new JLabel();
		profile.setBounds(386, 129, 194, 152);
		profile.setIcon(new ImageIcon(image.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH)));
		contentPane.add(profile);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Cooper Black", Font.BOLD, 18));
		lblNewLabel.setText("Nombre: "+Login.datos[0]);
		
		
		
		lblNewLabel.setBounds(407, 381, 155, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("Apellido:"+Login.datos[1]);
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(373, 410, 215, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setText("No. Carné: "+Login.datos[2]);
		lblNewLabel_2.setFont(new Font("Cooper Black", Font.BOLD, 18));
		lblNewLabel_2.setBounds(365, 441, 215, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblBienvenido = new JLabel();
		lblBienvenido.setText("Bienvenido");
		lblBienvenido.setFont(new Font("Cooper Black", Font.BOLD, 18));
		lblBienvenido.setBounds(407, 111, 123, 40);
		contentPane.add(lblBienvenido);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login reg=new Login();
				reg.setVisible(true);
				Bienvenida.this.dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(44, 452, 145, 40);
		contentPane.add(btnNewButton);
		
		
		ImageIcon image2=new ImageIcon("logo.png");
		JLabel log = new JLabel();
		log.setBounds(0, 0, 145, 119);
		log.setIcon(new ImageIcon(image2.getImage().getScaledInstance(log.getWidth(), log.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(log);
		
		
		
	}
}
