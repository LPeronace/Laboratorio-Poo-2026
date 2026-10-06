package Diseño;

import java.awt.EventQueue;
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
public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private CardLayout cl = new CardLayout(0,0);
	private JPanel panelMundo = new PanelMundo();
	private JPanel panelPersona = new PanelPersona();
	private JPanel panelCrearPersonaje = new PanelCrearPersonaje();
	private final JButton botonMenuBarMundo = new JButton("Mundo");
	private final JButton botonMenuBarPersonaje = new JButton("Personaje");
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
		validate();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		
		//Defino el layout a un cardlayout ya creado
		getContentPane().setLayout(cl);
		//Añado todos los paneles al contentPane con un tag para identificarlos para cuando los muestro
		getContentPane().add(panelMundo, "panelMundo");
		getContentPane().add(panelPersona, "panelPersona");
		getContentPane().add(panelCrearPersonaje, "panelCrearPersonaje");
		cl.show(getContentPane(), getContentPane().getName());
		
		JMenuBar barritaPaneles = new JMenuBar();
		barritaPaneles.setToolTipText("");
		setJMenuBar(barritaPaneles);
		
		JButton botonMenuBarCrearPersonaje = new JButton("Crear Personaje");
		barritaPaneles.add(botonMenuBarCrearPersonaje);
		
		
		barritaPaneles.add(botonMenuBarMundo);
		
		barritaPaneles.add(botonMenuBarPersonaje);
		
		
		//El show del cardlayout sirve para mostrar el panel que quiera
		cl.show(getContentPane(), "panelCrearPersonaje");
		
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
		
		botonMenuBarPersonaje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(getContentPane(), "panelPersona");

			}
		});
		
		
			
	}
}
