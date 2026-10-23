package Diseño;

import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import bd.Conexion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modelo.Mundo;
import modelo.Persona;
public class PanelCrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private Mundo m = new Mundo();
	private JPanel panelActual = this;
	private JSpinner spinnerSecreto = new JSpinner();
	private JSpinner spinnerUbicacion = new JSpinner();
	private JSpinner spinnerLocura = new JSpinner();
	private JLabel titulo;
	private JLabel labelLocura;
	private JLabel lblSecretos;
	private JLabel labelUbicacion;
	private JButton botonCrear;
	private Persona pActual;
	private Conexion dao = new Conexion();
	
	public PanelCrearPersonaje(Mundo m, JFrame marco) {
		this.m = m;
		setLayout(null);
		setBounds(0,0,1000,700);
		setBackground(Color.DARK_GRAY);

		crearLabels();
		crearBoton();
		definirSpinners();
		eventoBoton();
	}
	
	
	public void crearLabels() {
		titulo = new JLabel("Menu Crear Personaje");
		titulo.setForeground(new Color(255, 128, 255));
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		titulo.setBounds(284, 38, 225, 42);
		add(titulo);
		
		labelLocura = new JLabel("Locura");
		labelLocura.setForeground(new Color(255, 128, 255));
		labelLocura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelLocura.setBounds(110, 149, 74, 14);
		add(labelLocura);
		
		lblSecretos = new JLabel("Secretos");
		lblSecretos.setForeground(new Color(255, 128, 255));
		lblSecretos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSecretos.setBounds(344, 149, 89, 14);
		add(lblSecretos);
		
		labelUbicacion = new JLabel("Ubicacion");
		labelUbicacion.setForeground(new Color(255, 128, 255));
		labelUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelUbicacion.setBounds(612, 149, 126, 14);
		add(labelUbicacion);
	}
	public void definirSpinners() {
		spinnerLocura.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerLocura.setBounds(110, 191, 46, 20);
		add(spinnerLocura);
		
		
		spinnerSecreto.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerSecreto.setBounds(344, 191, 46, 20);
		add(spinnerSecreto);
		
		spinnerUbicacion.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		spinnerUbicacion.setBounds(612, 191, 46, 20);
		add(spinnerUbicacion);
		
	}
	
	public void crearBoton() {
		botonCrear = new JButton("Crear Personaje");
		botonCrear.setBounds(284, 352, 149, 23);
		add(botonCrear);
		
	}
	
	public void eventoBoton() {
		botonCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(crearPersonaje()) {
					m.agregarPersona(pActual);
					dao.agregar(pActual);
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
		boolean creo;
		int locura = (int) spinnerLocura.getValue();
		int secreto = (int) spinnerSecreto.getValue();
		int ubicacion = (int) spinnerUbicacion.getValue();
		
		pActual = new Persona(locura, secreto, ubicacion);
		//nunca falla, es al pedo la comprobacion despues se borra
		if(pActual != null) {
			creo = true;
			
		}
		else {
			creo = false;
		}
		return creo;
	}
}
