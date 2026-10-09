package Diseño;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Persona;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PanelMundo extends JPanel {

	private static final long serialVersionUID = 1L;
	private ArrayList<Persona> personajes = new ArrayList<>();

	/**
	 * Create the panel.
	 */
	public PanelMundo() {
		setForeground(new Color(255, 255, 255));
		setBackground(Color.DARK_GRAY);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0,0,1000,700);
		setLayout(null);
		
		JLabel Titulo = new JLabel("Bienvenido al menu del Mundo");
		Titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Titulo.setBounds(218, 182, 390, 64);
		add(Titulo);
		
		JButton botonDeterminarNormales = new JButton("Determinar normales");
		botonDeterminarNormales.setBounds(69, 351, 148, 23);
		add(botonDeterminarNormales);
		
		JLabel textoGeneral = new JLabel("");
		textoGeneral.setBounds(118, 606, 558, 14);
		add(textoGeneral);
		
		JButton botonCuantosPersonajesLindos = new JButton("¿Cuantos personajes lindos?");
		botonCuantosPersonajesLindos.setBounds(283, 351, 199, 23);
		add(botonCuantosPersonajesLindos);
		
		JButton botonCuantosPerosnajesNormales = new JButton("¿Cuantos personajes normales?");
		botonCuantosPerosnajesNormales.setBounds(527, 351, 199, 23);
		add(botonCuantosPerosnajesNormales);
		
		JButton botonCuantosMaravilla = new JButton("¿Cuantos en Maravilla?");
		botonCuantosMaravilla.setBounds(69, 438, 148, 23);
		add(botonCuantosMaravilla);
		
		JButton botonMayorLocura = new JButton("¿Quien tiene mayor locura?");
		botonMayorLocura.setBounds(283, 438, 199, 23);
		add(botonMayorLocura);
		
		JButton botonCuantosLindos = new JButton("¿Cuantos lindos?");
		botonCuantosLindos.setBounds(435, 518, 148, 23);
		add(botonCuantosLindos);
		
		JButton botonCuantosNormales = new JButton("¿Cuantos Normales?");
		botonCuantosNormales.setBounds(168, 518, 148, 23);
		add(botonCuantosNormales);
		
		JButton botonMasLindosONormales = new JButton("¿Hay mas lindos o normales?");
		botonMasLindosONormales.setBounds(527, 438, 199, 23);
		add(botonMasLindosONormales);
		
		
		
		
		
	}
}
