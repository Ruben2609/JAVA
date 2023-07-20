package ProyectoAlbum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;

public class Albumshow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable listaContenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Albumshow frame = new Albumshow();
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
	public Albumshow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelImagen = DefaultComponentFactory.getInstance().createLabel("");
		labelImagen.setForeground(new Color(0, 0, 0));
		labelImagen.setBackground(new Color(0, 0, 0));
		labelImagen.setIcon(null);
		labelImagen.setBounds(179, 25, 476, 326);
		
		contentPane.add(labelImagen);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(443, 362, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(264, 362, 169, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		listaContenido = new JTable();
		listaContenido.setBounds(166, 391, -139, -364);
		contentPane.add(listaContenido);
	}
}
