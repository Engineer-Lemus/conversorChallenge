import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JComboBox opciones;
	private JButton btnConvertir;
	private JLabel resultado;
	private JButton btnSalir;
	private JLabel pngOracle;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Conversor() {
		setTitle("Conversor Challenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 857, 543);
		
		JMenuBar Colores = new JMenuBar();
		setJMenuBar(Colores);
		
		JMenu mnNewMenu = new JMenu("Cmbiar");
		Colores.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Blanco");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.WHITE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor Moneda");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(78, 45, 185, 32);
		contentPane.add(lblNewLabel);
		
		opciones = new JComboBox();
		opciones.setFont(new Font("Arial", Font.PLAIN, 19));
		opciones.setModel(new DefaultComboBoxModel(new String[] {"Pesos a Dólares", "Dolares a Pesos", "Pesos a Euros", "Euros a Pesos", "Pesos a Libras Esterlinas", "Libras Esterlinas a Pesos", "Pesos a Yen Japonés", "Yen Japones a Pesos", "Pesos a Won sul-coreano", "Won sul-coreano a Pesos"}));
		opciones.setBounds(75, 105, 312, 32);
		contentPane.add(opciones);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese un Monto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(78, 172, 169, 25);
		contentPane.add(lblNewLabel_1);
		
		valor = new JTextField();
		valor.setFont(new Font("Arial", Font.PLAIN, 19));
		valor.setBounds(256, 172, 131, 25);
		contentPane.add(valor);
		valor.setColumns(10);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor2 = valor.getText();
				double valorNum = Double.parseDouble(valor2);
				
				double tipoCambioDolar =17.60;
				double tipoCambioEuro =18.86;
				double tipoCambioLibra =21.98;
				double tipoCambioYen =0.12;
				double tipoCambioWon =0.013;
				
				double resultadoFinal =0;
				 
				DecimalFormat formatear = new DecimalFormat("0.00");
				
				if(opciones.getSelectedIndex() ==0) {
					resultadoFinal = (valorNum/tipoCambioDolar);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==1) {
					resultadoFinal = (valorNum*tipoCambioDolar);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==2) {
					resultadoFinal = (valorNum/tipoCambioEuro);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==3) {
					resultadoFinal = (valorNum*tipoCambioEuro);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==4) {
					resultadoFinal = (valorNum/tipoCambioLibra);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==5) {
					resultadoFinal = (valorNum*tipoCambioLibra);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==6) {
					resultadoFinal = (valorNum/tipoCambioYen);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==7) {
					resultadoFinal = (valorNum*tipoCambioYen);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==8) {
					resultadoFinal = (valorNum/tipoCambioWon);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}else if(opciones.getSelectedIndex() ==9) {
					resultadoFinal = (valorNum*tipoCambioWon);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));	
				}
			}
		});
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConvertir.setBounds(78, 285, 137, 32);
		contentPane.add(btnConvertir);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(350, 429, 143, 45);
		contentPane.add(btnSalir);
		
		resultado = new JLabel("0");
		resultado.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		resultado.setBounds(266, 285, 319, 32);
		contentPane.add(resultado);
		
		pngOracle = new JLabel("New label");
		pngOracle.setIcon(new ImageIcon("C:\\Users\\tapat\\Downloads\\Oracle-Next-Education--e1678304093153.png"));
		pngOracle.setBounds(437, 45, 342, 200);
		contentPane.add(pngOracle);
	}
}
