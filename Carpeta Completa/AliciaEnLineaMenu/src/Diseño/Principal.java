package Diseño;

import java.awt.EventQueue;

import modelo.Mundo;
import modelo.Persona;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private CardLayout cl = new CardLayout(0,0);
	private Mundo m = new Mundo();
	private JPanel panelMundo = new PanelMundo(m);
	private JPanel panelPersona = new PanelPersona(m);
	private JPanel panelCrearPersonaje = new PanelCrearPersonaje(m);
	private JPanel panelPrincipal = new JPanel();
	private JButton botonMenuBarMundo; 
	private JButton botonMenuBarPersonaje; 
	private JButton botonMenuBarPrincipal; 
	private JButton botonMenuBarCrearPersonaje;
	private JLabel labelTituloMenu = new JLabel("Bienvenido Al Menu Principal!!!!!");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		crearBotones();
		
		eventoBotones();
		
		setBackground(Color.DARK_GRAY);
		validate();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		
		//Defino el layout a un cardlayout ya creado
		getContentPane().setLayout(cl);
		
		//Añado todos los paneles al contentPane con un tag para identificarlos para cuando los muestro
		getContentPane().add(panelPrincipal, "panelPrincipal");
		panelPrincipal.setLayout(null);
		labelTituloMenu.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		labelTituloMenu.setBounds(304, 241, 310, 14);
		
		panelPrincipal.add(labelTituloMenu);
		getContentPane().add(panelMundo, "panelMundo");
		getContentPane().add(panelPersona, "panelPersona");
		getContentPane().add(panelCrearPersonaje, "panelCrearPersonaje");
		cl.show(getContentPane(), getContentPane().getName());
		
		
		
		
		
		
		//El show del cardlayout sirve para mostrar el panel que quiera
		cl.show(getContentPane(), "panelPrincipal");
		
		
	}
	public void crearBotones() {
		botonMenuBarMundo = new JButton("Mundo");
		botonMenuBarPersonaje = new JButton("Personaje");
		botonMenuBarPrincipal = new JButton("Principal");
		botonMenuBarCrearPersonaje = new JButton("Crear Personaje");
		
		JMenuBar barritaPaneles = new JMenuBar();
		barritaPaneles.setToolTipText("");
		setJMenuBar(barritaPaneles);
		
		barritaPaneles.add(botonMenuBarPrincipal);
		barritaPaneles.add(botonMenuBarCrearPersonaje);
		barritaPaneles.add(botonMenuBarPersonaje);
		barritaPaneles.add(botonMenuBarMundo);
	}
	public void eventoBotones() {
		botonMenuBarCrearPersonaje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(getContentPane(), "panelCrearPersonaje");
				
			}
		});
		
		botonMenuBarMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(getContentPane(), "panelMundo");

			}
		});
		
		botonMenuBarPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(getContentPane(), "panelPrincipal");
			}
		});
		
		botonMenuBarPersonaje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(getContentPane(), "panelPersona");

			}
		});
	}
}
