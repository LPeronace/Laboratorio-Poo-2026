package Diseño;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PanelCrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelCrearPersonaje() {
		setLayout(null);
		setBounds(0,0,1000,700);
		
		JLabel Titulo = new JLabel("Menu Crear Personaje");
		Titulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Titulo.setBounds(284, 38, 225, 42);
		add(Titulo);
		
		JButton botonCrear = new JButton("New button");
		botonCrear.setBounds(360, 264, 89, 23);
		add(botonCrear);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.setBounds(111, 191, 30, 20);
		add(spinner);
		
		
		
		
	}
}
