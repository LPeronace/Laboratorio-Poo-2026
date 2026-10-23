package Diseño;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Mundo;
import modelo.Persona;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelMundo extends JPanel {

	private static final long serialVersionUID = 1L;
	private Mundo m = new Mundo();
	private JPanel panelActual = this;
	private JButton botonCuantosMaravilla;
	private JButton botonCuantosPersonajesLindos;
	private JButton botonCuantosNormales;
	private JButton botonMayorLocura;
	private JButton	botonMasLindosONormales;
	private JLabel titulo;
	
	
	//JOptionPane.showMessageDialog(panelActual, "Personaje Creado");
	
	public PanelMundo(Mundo m, JFrame marco) {
		setForeground(new Color(255, 255, 255));
		setBackground(Color.DARK_GRAY);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0,0,1000,700);
		setLayout(null);
		
		
		this.m = m;
		crearLabels();
		crearBotones();
		accionBotones();
		
	}
	
	
	
	public void crearBotones() {
		botonCuantosPersonajesLindos = new JButton("¿Cuantos personajes lindos?");
		botonCuantosPersonajesLindos.setBounds(375, 351, 199, 23);
		add(botonCuantosPersonajesLindos);
		
		botonCuantosNormales = new JButton("¿Cuantos Normales?");
		botonCuantosNormales.setBounds(689, 351, 167, 23);
		add(botonCuantosNormales);
		
		botonCuantosMaravilla = new JButton("¿Cuantos en Maravilla?");
		botonCuantosMaravilla.setBounds(119, 351, 182, 23);
		add(botonCuantosMaravilla);
		
		botonMayorLocura = new JButton("¿Quien tiene mayor locura?");
		botonMayorLocura.setBounds(175, 438, 199, 23);
		add(botonMayorLocura);
		
		botonMasLindosONormales = new JButton("¿Hay mas lindos o normales?");
		botonMasLindosONormales.setBounds(581, 438, 223, 23);
		add(botonMasLindosONormales);
		
	}
	
	public void crearLabels() {
		titulo = new JLabel("Bienvenido al menu del Mundo");
		titulo.setForeground(new Color(255, 128, 255));
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(313, 181, 390, 64);
		add(titulo);
		
	}
	
	public void accionBotones() {
		botonCuantosNormales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cantidad = m.CuantosNormales();
				
				mostrarOptionPane("Hay "+ cantidad + " personajes normales");
				
			}
		});
		
		botonCuantosPersonajesLindos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cantidad = m.CuantosLindos();
				
				mostrarOptionPane("Hay "+ cantidad + " personajes lindos");
			}
		});
		
		botonMasLindosONormales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean hayMasLindos = m.determinarMasLindosQueNormales();
				if(m.CuantosLindos() == m.cuantosMaravilla()) {
					mostrarOptionPane("Hay la misma cantidad de personajes normales que lindos");
				}
				else if(hayMasLindos) {
					mostrarOptionPane("Hay mas personajes lindos que normales.");
				}
				else{
					mostrarOptionPane("Hay mas personajes normales que lindos.");
				}
				
			}
		});
		
		botonMayorLocura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(m.getLasPersonas().size() == 0) {
					mostrarOptionPane("No hay personas cargadas");
				}
				else {
					int id = verId(m.mayorLocura());
					mostrarOptionPane("La persona con mayor locura es la que tiene el id:"+id);
				}
				
			}
		});
		
		botonCuantosMaravilla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cantidad = m.cuantosMaravilla();
				
				mostrarOptionPane("Hay "+cantidad+" personas en el mundo de las maravillas");
			}
		});
	}
	public void mostrarOptionPane(String s) {
		JOptionPane.showMessageDialog(panelActual, s);
	}
	public int verId(Persona p) {
		int contador = 0;
		boolean salir = false;
		ArrayList<Persona> personitas = m.getLasPersonas();
		while(!salir) {
			if(personitas.get(contador) == p) {
				salir = true;
			}
			contador++;
		}
		
		return contador;
	}
}
