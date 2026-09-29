package Diseño;

import java.awt.EventQueue;

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

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		
		
		//crear todos los paneles en private, uno por cada clase de panel
		//crear metodo privado para crear los paneles y agregarlos
		//otro para los eventos de los botones
		//todo para achicar el constructor
		//hacer un menu con botones para cambiar de pestaña con menuBar
		
			
	}
}
