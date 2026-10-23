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

public class PanelConsulta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private Conexion c = new Conexion();
	Object [] columnas;
	private DefaultTableModel modelo;
	private JScrollPane scrollPane;
	
	
	public PanelConsulta(JFrame marco) {
		setBackground(new Color(64, 128, 128));
		setLayout(null);
		llenarTabla();
		
		
		
		
	}
	//error no se porque
	public void llenarTabla() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 59, 229, 82);
		add(scrollPane);
		table = new JTable();
		//modelo para la columna
		Object [] columnas = new Object[] {"id","locura", "secretos", "ubicacion"};
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
