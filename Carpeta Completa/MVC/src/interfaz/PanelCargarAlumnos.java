package interfaz;

import javax.swing.JPanel;

import javax.swing.JTextField;

import bdd.Conexion;
import modelo.Alumno;
import modelo.Meses;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.*;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCargarAlumnos extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldNombre;
	private JTextField textFieldDNI;
	
	private JComboBox comboBox;
	private JComboBox comboBoxMes;
	
	private JLabel labelEstudios;
	private JLabel labelFechaNacimiento;
	private JLabel labelNombre;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAño;
	private JLabel lblDNI;
	
	private Conexion c = new Conexion();
	
	private JButton botonCargar; 
	
	private JSpinner spinnerDia;
	private JSpinner spinnerMes;
	private JSpinner spinnerAño;
	
	private Checkbox checkbox;
	
	private Meses m;
	
	private JPanel panelActual = this;
	
	public PanelCargarAlumnos() {
		setLayout(null);
		setBounds(100, 100, 800, 500);
		crearLabels();
		crearTextFields();
		crearBotones();
		crearCheckBox();
		crearComboBox();
		crearSpinner();
		eventoBotones();
		

	}
	
	
	public void crearLabels() {
		labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(79, 67, 46, 14);
		add(labelNombre);
		
		labelFechaNacimiento = new JLabel("Fecha Nacimiento");
		labelFechaNacimiento.setBounds(49, 138, 95, 14);
		add(labelFechaNacimiento);

		lblDia = new JLabel("Dia");
		lblDia.setBounds(221, 109, 46, 14);
		add(lblDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setBounds(322, 109, 46, 14);
		add(lblMes);
		
		lblAño = new JLabel("Año");
		lblAño.setBounds(413, 109, 46, 14);
		add(lblAño);
		
		lblDNI = new JLabel("DNI");
		lblDNI.setBounds(79, 303, 46, 14);
		add(lblDNI);
		
		labelEstudios = new JLabel("Estudios");
		labelEstudios.setBounds(49, 184, 46, 14);
		add(labelEstudios);
	}
	public void crearTextFields() {
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(211, 57, 95, 34);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldDNI = new JTextField();
		
		textFieldDNI.setBounds(211, 300, 86, 20);
		add(textFieldDNI);
		textFieldDNI.setColumns(10);
	}
	public void crearBotones() {
		botonCargar = new JButton("Cargar");
		botonCargar.setBounds(206, 353, 89, 23);
		add(botonCargar);
		
	}
	public void crearComboBox() {
		comboBox = new JComboBox();
		comboBox.setBounds(209, 184, 220, 54);
		add(comboBox);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setBounds(294, 135, 74, 20);
		add(comboBoxMes);
		
		for(String s : c.elementosComboBox()) {
			comboBox.addItem(s);
		}
		for(Meses m:m.values()) {
			comboBoxMes.addItem(m);
		}
		
		comboBoxMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarModeloSpinner();
			}
		});
		
	}
	public void actualizarModeloSpinner() {
		Meses mes = (Meses) comboBoxMes.getSelectedItem();//agarra directamente el item seleccionado, en este caso por ejemplo es
		//Meses.FEBRRERO
		spinnerDia.setModel(new SpinnerNumberModel(1, 1, mes.getDia(), 1));
		
	}
	
	public void crearCheckBox() {
		checkbox = new Checkbox("HIJOS?");
		checkbox.setBounds(206, 256, 95, 22);
		add(checkbox);
	}
	
	public void crearSpinner() {
		spinnerDia = new JSpinner();
		spinnerDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinnerDia.setBounds(209, 135, 52, 20);
		add(spinnerDia);
		
		spinnerAño = new JSpinner();
		spinnerAño.setModel(new SpinnerNumberModel(1, 1, 2026, 1));
		spinnerAño.setBounds(401, 135, 58, 20);
		add(spinnerAño);
		
	}
	
	
	public void eventoBotones() {
		botonCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(checkearDatos()) {
					c.agregarAlumno(cargar());
					
					JOptionPane.showMessageDialog(panelActual, "Se cargo el personaje con exito :)");
				}
				else {
					JOptionPane.showMessageDialog(panelActual, "Algun dato esta mal cargado o ya existe en nuestra base de datos :(");
				}
				
			}
		});
		
	}
	
	
	public boolean checkearDatos() {
		boolean taBien = true;
		
		if(c.buscarDNI(textFieldDNI.getText()) || textFieldNombre.getText() == "".trim() ) {
			taBien = false;
		}
		
		return taBien;
	}
	
	public Alumno cargar() {
		Alumno personita;
		
		int dia =(int) spinnerDia.getValue();
		int mes = (int) comboBoxMes.getSelectedIndex() + 1;
		int año = (int) spinnerAño.getValue();
		LocalDate fechaCompleta = LocalDate.of(año, mes, dia);
		
		String nombre = textFieldNombre.getText();
		
		boolean hijos = checkbox.getState();
		
		int idEstudio = (int) comboBox.getSelectedIndex() + 1;
		
		
		
		String dni = textFieldDNI.getText();
			
		
		//constructor String dni,String nombre, LocalDate fecha, boolean tieneHijo, int idEstudio
		personita = new Alumno(dni, nombre, fechaCompleta, hijos, idEstudio);
		
		
		return personita;
	}
	
}
