package Proyectocartas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class vistaCarta extends JPanel {

	private Carta carta;
	
	public vistaCarta(Carta carta) {
		this.carta = carta;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel(getCarta().getNumero() + "");
		lblNewLabel.setBounds(10, 11, 210, 67);
		add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel(getCarta().getTipo()+ "");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 89, 210, 152);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(getCarta().getNumero()+ "");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 252, 210, 67);
		add(lblNewLabel_2);

	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}
}
