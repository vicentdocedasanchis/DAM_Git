package Ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	// PROIEDADES o atributos de la clase VentanaPrincipal
	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField textoApellidos;
	private JTextField textoEdad;
	private JButton btnJugar;
	private JTextField textoMsj;

	// creo una referencia a la clase Login. Apunta al objeto login, no crea ningun objeto Login.
		private Login referenciaLogin;
	// creo una referencia a la clase Juego. Apunta al objeto ventanaJuego, no crea ningun objeto Juego.
		private Juego ventanaJuego;

	// CREAR objeto jugador
	private Jugador nuevoJug;

	// CONSTRUCTOR
	public Login(Juego vJ) {
		setTitle("Login");
		// Configuración
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Etiqueta Datos del Jugador
		JLabel lblDatosDelJugador = new JLabel("DATOS DEL JUGADOR");
		lblDatosDelJugador.setBounds(184, 31, 124, 16);
		contentPane.add(lblDatosDelJugador);

		// Etiqueta nombre
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 107, 45, 16);
		contentPane.add(lblNombre);

		// Campo nombre del jugador
		textoNombre = new JTextField();
		textoNombre.setBounds(192, 104, 271, 22);
		contentPane.add(textoNombre);
		textoNombre.setColumns(10);

		// Etiqueta apellidos
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(54, 148, 66, 16);
		contentPane.add(lblApellidos);

		// Campo para los apellidos del jugador
		textoApellidos = new JTextField();
		textoApellidos.setBounds(192, 145, 271, 22);
		contentPane.add(textoApellidos);
		textoApellidos.setColumns(10);

		// Etiqueta para la edad
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(54, 189, 28, 16);
		contentPane.add(lblEdad);

		// Campo para la edad del jugador
		textoEdad = new JTextField();
		textoEdad.setBounds(192, 186, 116, 22);
		contentPane.add(textoEdad);
		textoEdad.setColumns(10);
		
		// ASIGNO this a referenciaLogin.Ahora referenciaLogin representa a toda la clase.Guardado una copia del objeto login.
		referenciaLogin = this;
		// ASIGNO vJ a ventanaJuego para distinguirlas aunque apunta al mismo objeto Juego
		ventanaJuego=vJ;
		
							
		// Boton para iniciar juego
		btnJugar = new JButton("A JUGAR");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Primero valido los campos
				if (textoNombre.getText().length() == 0) {
					textoMsj.setText("Te faltan datos");
				} else if (textoApellidos.getText().length() == 0) {
					textoMsj.setText("Te faltan datos");
				} else if (textoEdad.getText().length() == 0) {
					textoMsj.setText("Te faltan datos");
				} else {
					// luego recojo los valores y los guardo
					nuevoJug.setNombre(textoNombre.getText());
					nuevoJug.setApellidos(textoApellidos.getText());
					//creo una variable intermedia para guardar el campo textoEdad que si es un String
					String edadString = textoEdad.getText();
					//si el campo contiene algo lo convierto en integer, lo guardo y pongo la edad
					if (edadString.length() > 0) {
						int edad = Integer.valueOf(edadString);
						nuevoJug.setEdad(edad);
					}
					// lanzo mensaje si todos los campos estan completos
					/*textoMsj.setText("El jugador " + nuevoJug.getNombre() + " " + nuevoJug.getApellidos() + " de edad "
							+ nuevoJug.getEdad() + " puede comenzar a jugar");*/
				
					/*
					 * "Bienvenido al juego " +  nuevoJug.getNombre() cojo el campo de texto lo guardo en el objeto nuevoJug
					 *  y lo concateno con el String "Bienvenido al juego".
					 *  Con setText lo muestro en la variable JLabel msjJugador.
					 *  Accedo a todo lo anterior mediante una referencia a la clase Juego que llama ventanaJuego.
					 * 
					 */
					
					ventanaJuego.msjJugador.setText("Bienvenido al juego " +  nuevoJug.getNombre() );
					
					//llamo al método dispose() y cierro la ventana login
					//referenciaLogin.dispose();
					ventanaJuego.setVisible(true);
					referenciaLogin.setVisible(false);
					
				} // fin de else			
				
			}
			
		});// fin botón

		btnJugar.setBounds(54, 268, 409, 25);
		contentPane.add(btnJugar);

		// Texto para los mensajes
		textoMsj = new JTextField();
		textoMsj.setEditable(false);
		textoMsj.setBounds(54, 329, 409, 61);
		contentPane.add(textoMsj);
		textoMsj.setColumns(10);

		// Inicializo un objeto jugador
		nuevoJug = new Jugador();

	}// Fin del constructor de la clase VentanaPrincipal
} // Fin de la clase VentanaPrincipal
