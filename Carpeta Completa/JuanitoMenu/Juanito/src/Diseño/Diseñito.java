package Diseño;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import modelo.Persona;
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class Diseñito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private Persona persona = new Persona();
	private JTextField cantidadComida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseñito frame = new Diseñito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Diseñito() {
		
		//DEFINICIONES 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(51, 102, 51));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel texto1 = new JLabel("Juanito");
		texto1.setBounds(419, 39, 121, 75);
		texto1.setForeground(new Color(255, 255, 255));
		texto1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 40));
		panelPrincipal.add(texto1);
		
		JButton boton1 = new JButton("Comer");
		boton1.setBounds(436, 125, 89, 23);
		panelPrincipal.add(boton1);
		
		JButton boton2 = new JButton("Esta Lleno");
		boton2.setBounds(436, 351, 89, 23);
		panelPrincipal.add(boton2);
		
		JButton boton3 = new JButton("Crecer");
		boton3.setBounds(129, 351, 89, 23);
		panelPrincipal.add(boton3);
		
		JButton boton4 = new JButton("Digerir");
		boton4.setBounds(767, 351, 89, 23);
		panelPrincipal.add(boton4);
		
		JProgressBar barritaComida = new JProgressBar();
		barritaComida.setBounds(695, 125, 146, 14);
		barritaComida.setMaximum(persona.getCapacidadEstomago());
		barritaComida.setValue(0);
		panelPrincipal.add(barritaComida);
		
		JLabel labelBarraDeComida = new JLabel("ÑAM ÑAM: "+persona.getCantidadIngerida());
		labelBarraDeComida.setBounds(692, 86, 164, 28);
		labelBarraDeComida.setForeground(new Color(255, 255, 255));
		labelBarraDeComida.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panelPrincipal.add(labelBarraDeComida);
		
		cantidadComida = new JTextField();
		cantidadComida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cantidadComida.setBounds(436, 172, 86, 20);
		panelPrincipal.add(cantidadComida);
		cantidadComida.setColumns(10);
		
		
		
		
		
		
		//-------ACCION DE BOTONES--------
		
		//Barrita Dinamica(sumatoria cuando come)
		boton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorActual = barritaComida.getValue();
				//tarea hacer un parse por el cuadro de texto.
				
				valorNuevo = valorActual+ cantidadComida.getText();
				labelBarraDeComida.setText("ÑAM ÑAM:"+valorNuevo);
				barritaComida.setValue(valorNuevo);
				persona.comer(40);
				
			}
		});
		
		
		//Barrita Dinamica (Baja a 0)
		boton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				barritaComida.setValue(0);
				labelBarraDeComida.setText("ÑAM ÑAM:"+ barritaComida.getValue());
				persona.digerir();
			}
		});
		
		//
		boton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				persona.crecer();
				barritaComida.setMaximum(persona.getCapacidadEstomago());
				

				
			}
		});
		
		
	}
}
