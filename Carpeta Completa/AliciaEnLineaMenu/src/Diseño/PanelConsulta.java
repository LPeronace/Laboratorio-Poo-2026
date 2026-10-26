package Diseño;

import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bd.Conexion;
import modelo.Persona;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelConsulta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private Conexion c = new Conexion();
	private Object [] columnas;
	private DefaultTableModel modelo;
	private JScrollPane scrollPane;
	private JButton botonEliminar;
	private JButton botonActualizar;
	private JSpinner spinnerIDBorrar;
	
	public PanelConsulta(JFrame marco) {
		setBackground(new Color(64, 128, 128));
		setLayout(null);
		crearBotones();
		crearSpinner();
		accionBotones();
		llenarTabla();
		
		
		
		
	}
	public void crearBotones() {
		botonEliminar = new JButton("Borrar");
		botonEliminar.setBounds(319, 40, 89, 23);
		add(botonEliminar);
		
		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(319, 182, 89, 23);
		add(botonActualizar);
	}
	public void crearSpinner() {
		spinnerIDBorrar = new JSpinner();
		spinnerIDBorrar.setModel(new SpinnerNumberModel(1, 1, 2, 1));
		spinnerIDBorrar.setBounds(329, 82, 50, 20);
		add(spinnerIDBorrar);
	}
	
	public void accionBotones() {
		botonActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		botonEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
	}
	
	public void llenarTabla() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 59, 229, 82);
		add(scrollPane);
		table = new JTable();
		//modelo para la columna
		columnas = new Object[] {"id","locura", "secretos", "ubicacion"};
		table.setBounds(228, 6, 100, 100);		
		modelo = new DefaultTableModel(columnas, 0);		
		
		modelo.setRowCount(0);
		table.setModel(modelo);
		int i = 0;
		
		for(Persona p: c.conseguirPersonas()) {
			//son los datos cargados, el addRow añade la fila con todos esos datos
			modelo.addRow(new Object[] {i,p.getLocura(),p.getSecreto(),p.getUbicacion() } );
			i++;
		}
		
		scrollPane.setViewportView(table);
		
		}
}
