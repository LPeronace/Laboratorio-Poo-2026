package Diseño;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Mundo;
import modelo.Persona;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PanelPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botonEsNormal;
	private JButton botonEstaEnMaravilla;
	private JButton botonEmbellecer;
	private JButton botonEsLindo;
	private JLabel labelMenuPersona;
	private Mundo m = new Mundo();
	private JLabel labelSelector;
	private JSpinner spinnerID; 
	private JPanel panelActual = this;
	private Persona p;
	
	
	public PanelPersona(Mundo m, JFrame marco) {
		this.m = m;
		
		setBounds(0, 0, 1000, 700);
		setBackground(Color.DARK_GRAY);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		
		crearLabels();
		crearBotones();
		accionBotones();
		crearSpinner();
		validate();
	}
	public void crearSpinner() {
		spinnerID = new JSpinner();
		spinnerID.setModel(new SpinnerNumberModel(0, 0, m.getLasPersonas().size(), 1));
		spinnerID.setBounds(716, 36, 40, 20);
		add(spinnerID);
	}
	
	public void crearBotones() {
		botonEsLindo = new JButton("¿Es Lindo?");
		botonEsLindo.setBounds(145, 154, 137, 23);
		add(botonEsLindo);
		
		botonEsNormal = new JButton("¿Es Normal?");
		botonEsNormal.setBounds(544, 154, 137, 23);
		add(botonEsNormal);
		
		botonEstaEnMaravilla = new JButton("¿Esta en maravilla?");
		botonEstaEnMaravilla.setBounds(145, 305, 190, 23);
		add(botonEstaEnMaravilla);
		
		botonEmbellecer = new JButton("Embellecer");
		
		botonEmbellecer.setBounds(544, 305, 137, 23);
		add(botonEmbellecer);
		
	}
	public void crearLabels() {
		labelMenuPersona = new JLabel("Menu Persona");
		labelMenuPersona.setForeground(new Color(255, 128, 255));
		labelMenuPersona.setBounds(346, 94, 111, 22);
		labelMenuPersona.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labelMenuPersona);
		
		labelSelector = new JLabel("ID:");
		labelSelector.setForeground(new Color(255, 128, 255));
		labelSelector.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelSelector.setBounds(677, 37, 53, 14);
		add(labelSelector);
		
		
	}
	
	public void personaID() {
		int id = (int) spinnerID.getValue();
		p = m.getLasPersonas().get(id);
	}
	
	public void accionBotones() {
		botonEsLindo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personaID();
				if(p.esLindo()) {
					mostrarOptionPane("El personaje es lindo");
				}
				else {
					mostrarOptionPane("El personaje no es lindo :(");
				}
			}
		});
		
		botonEstaEnMaravilla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personaID();
				
				if(p.estaMundoMaravilla()) {
					mostrarOptionPane("El personaje esta en el mundo de las maravillas");
				}
				else {
					mostrarOptionPane("El personaje no esta en el mundo de las maravillas :(");
				}
			}
		});
		
		botonEmbellecer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personaID();
				p.embellecer();
				mostrarOptionPane("El personaje fue embellecido con exito!");
			}
		});
		
		botonEsNormal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personaID();
				if(p.esNormal()) {
					mostrarOptionPane("El persona es normal!");
				}
				else {
					mostrarOptionPane("El personaje no es normal :(");
				}
			}
		});
	}
	
	public void mostrarOptionPane(String s) {
		JOptionPane.showMessageDialog(panelActual, s);
	}
}
