package Diseño;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPersona extends JPanel {

	private static final long serialVersionUID = 1L;

	public PanelPersona() {
		setBounds(0, 0, 1000, 700);
		setBackground(Color.DARK_GRAY);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JButton botonSiEsLindo = new JButton("¿Es Lindo?");
		botonSiEsLindo.setBounds(152, 154, 89, 23);
		add(botonSiEsLindo);
		
		JLabel labelMenuPersona = new JLabel("Menu Persona");
		labelMenuPersona.setBounds(303, 11, 111, 22);
		labelMenuPersona.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labelMenuPersona);
		
		JButton botonEstaEnMaravilla = new JButton("¿Esta en maravilla?");
		botonEstaEnMaravilla.setBounds(119, 305, 144, 23);
		add(botonEstaEnMaravilla);
		
		JButton botonEsNormal = new JButton("¿Es Normal?");
		botonEsNormal.setBounds(538, 305, 89, 23);
		add(botonEsNormal);
		
		JButton botonEmbellecer = new JButton("Embellecer");
		botonEmbellecer.setBounds(538, 154, 89, 23);
		add(botonEmbellecer);
		
		//Acciones
		botonSiEsLindo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
	}

}
