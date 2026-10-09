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
import modelo.Persona;
public class PanelCrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelActual = this;
	private JSpinner spinnerSecreto = new JSpinner();
	private JSpinner spinnerUbicacion = new JSpinner();
	private JSpinner spinnerLocura = new JSpinner();
	

	/**
	 * Create the panel.
	 */
	public PanelCrearPersonaje() {
		setLayout(null);
		setBounds(0,0,1000,700);
		setBackground(Color.DARK_GRAY);
		
		JLabel Titulo = new JLabel("Menu Crear Personaje");
		Titulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Titulo.setBounds(284, 38, 225, 42);
		add(Titulo);
		
		JButton botonCrear = new JButton("Crear Personaje");
		botonCrear.setBounds(284, 352, 149, 23);
		add(botonCrear);
		
		spinnerLocura.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerLocura.setBounds(110, 191, 30, 20);
		add(spinnerLocura);
		
		JLabel labelLocura = new JLabel("Locura");
		labelLocura.setBounds(110, 149, 46, 14);
		add(labelLocura);
		
		JLabel lblSecretos = new JLabel("Secretos");
		lblSecretos.setBounds(344, 149, 46, 14);
		add(lblSecretos);
		
		JLabel labelUbicacion = new JLabel("Ubicacion");
		labelUbicacion.setBounds(612, 149, 46, 14);
		add(labelUbicacion);
		
		
		spinnerSecreto.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerSecreto.setBounds(344, 191, 30, 20);
		add(spinnerSecreto);
		
		spinnerUbicacion.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		spinnerUbicacion.setBounds(612, 191, 30, 20);
		add(spinnerUbicacion);
		
		botonCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(crearPersonaje()) {
					JOptionPane.showMessageDialog(panelActual, "Personaje Creado");
				}
				else {
					JOptionPane.showMessageDialog(panelActual, "Error: no se pudo crear el personaje");
				}
				
			}
		});
		
	}
	
	public boolean crearPersonaje() {
		//
		Persona p;
		boolean creo;
		int locura = (int) spinnerLocura.getValue();
		int secreto = (int) spinnerSecreto.getValue();
		int ubicacion = (int) spinnerUbicacion.getValue();
		
		p = new Persona(locura, secreto, ubicacion);
		
		if(p != null) {
			creo = true;
			
		}
		else {
			creo = false;
		}
		return creo;
	}
}
