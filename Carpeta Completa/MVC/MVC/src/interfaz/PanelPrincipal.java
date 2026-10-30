package interfaz;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tablaTotal;
	
	
	public PanelPrincipal() {
		setLayout(null);
		setBounds(100, 100, 800, 500);	
		
		crearLista();
	
	}
	
	
	public void crearLista() {
		tablaTotal = new JTable();
		tablaTotal.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Edad", "Tiene Hijos?", "Nivel De Estudio"
			}
		));
		tablaTotal.getColumnModel().getColumn(0).setMinWidth(100);
		tablaTotal.getColumnModel().getColumn(3).setMinWidth(200);
		tablaTotal.setBounds(138, 59, 315, 114);
		add(tablaTotal);
	}
}
