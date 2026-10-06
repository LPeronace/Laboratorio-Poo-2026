package Diseño;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelCrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelActual = this;
	/**
	 * Create the panel.
	 */
	public PanelCrearPersonaje() {
		setLayout(null);
		setBounds(0,0,1000,700);
		setBackground(new Color(255, 255, 255));
		
		JLabel Titulo = new JLabel("Menu Crear Personaje");
		Titulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Titulo.setBounds(284, 38, 225, 42);
		add(Titulo);
		
		JButton botonCrear = new JButton("Crear Personaje");
		botonCrear.setBounds(344, 351, 149, 23);
		add(botonCrear);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.setBounds(110, 191, 30, 20);
		add(spinner);
		
		JLabel labelAvisoCreado = new JLabel("");
		labelAvisoCreado.setBounds(385, 412, 46, 14);
		add(labelAvisoCreado);
		
		botonCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(panelActual, "Personaje Creado");
			}
		});
		
		
		
		
	}
}
