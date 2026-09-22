package modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Taskbar;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 592, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOLA MUNDOOOOOO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(128, 217, 259, 31);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(new Color(255, 0, 128));
		contentPane.add(lblNewLabel);
		
		JLabel SegundoTexto = DefaultComponentFactory.getInstance().createLabel("Cositas");
		SegundoTexto.setBounds(174, 298, 139, 31);
		SegundoTexto.setVerticalAlignment(SwingConstants.TOP);
		SegundoTexto.setHorizontalAlignment(SwingConstants.LEFT);
		SegundoTexto.setEnabled(false);
		SegundoTexto.setBackground(Color.RED);
		contentPane.add(SegundoTexto);
		boolean tocado = false;
		JButton Boton = new JButton("boton");
		Boton.setForeground(Color.ORANGE);
		Boton.setBackground(Color.BLACK);
		Boton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Boton.setText("Te estas acercando");
			}
		});
		
		
		Boton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Boton.setText("Calientito");
			}
		
			@Override
			public void mousePressed(MouseEvent e) {
				Boton.setText("Te quemaste :(");

				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Boton.setText("Frio");
			}
		});
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Boton.setBounds(203, 106, 219, 26);
		contentPane.add(Boton);
	}
}
