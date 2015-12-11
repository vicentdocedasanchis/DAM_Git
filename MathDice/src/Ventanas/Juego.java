package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Juego extends JFrame {

	private JPanel contentPane;
	
	private JLabel msjJugador;

	/**
	 * Create the frame.
	 */
	public Juego() {
		setTitle("Juego");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta que muestra un mensaje al jugador
		msjJugador = new JLabel();
		msjJugador.setHorizontalAlignment(SwingConstants.CENTER);
		msjJugador.setBounds(288, 69, 193, 16);
		contentPane.add(msjJugador);
		
	}

	public JLabel getMsjJugador() {
		return msjJugador;
	}
	
}
