package Diseño;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelMundo extends JPanel {

	private static final long serialVersionUID = 1L;


	/**
	 * Create the panel.
	 */
	public PanelMundo() {
		setLayout(null);
		setBackground(new Color(0, 0, 0));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0,0,1000,700);
	}

}
