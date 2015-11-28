import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	// Propiedades
	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField textoApellidos;
	private JTextField textoEdad;
	private JTextField textoMsj;
	private JButton btnJugar;

	// Crear objeto jugador
	private Jugador nuevoJug;

	public VentanaPrincipal() {
		setTitle("Ventana Principal del Juego");
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

		// Boton para iniciar juego
		btnJugar = new JButton("A JUGAR");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				nuevoJug.setNombre(textoNombre.getText());
				nuevoJug.setApellidos(textoApellidos.getText());

				// el campo textoEdad que cojo con getText() si que es un String
				String edadString = textoEdad.getText();
				// mediante Integer.ValueOf que es un método de la clase Integer
				// convierto el String edadString en un integer
				if (edadString.length() > 0) {
					int edad = Integer.valueOf(edadString);
					nuevoJug.setEdad(edad);
				}
				// int edad = Integer.valueOf(edadString);
				//nuevoJug.setEdad(edad);
				
				//Estructura if-else if-else para validar los campo de entrada y lanzar el mensaje final si todos los campos estan completos
				if (textoNombre.getText().length() == 0) {
					textoMsj.setText("Te faltan datos");
				} else if (textoApellidos.getText().length() == 0) {
					textoMsj.setText("Te faltan datos");
				} else if (textoEdad.getText().length() == 0) {
					textoMsj.setText("Te faltan datos");
				} else {
					textoMsj.setText("El jugador " + nuevoJug.getNombre() + " " + nuevoJug.getApellidos() + " de edad "
							+ nuevoJug.getEdad() + " puede comenzar a jugar");
				}

			}
		});// fin botón

		btnJugar.setBounds(54, 268, 409, 25);
		contentPane.add(btnJugar);

		// Texto para los mensajes
		textoMsj = new JTextField();
		textoMsj.setBounds(54, 329, 409, 61);
		contentPane.add(textoMsj);
		textoMsj.setColumns(10);

		// Creo un objeto jugador
		nuevoJug = new Jugador();
		
	}// Fin del constructor de la clase VentanaPrincipal
} //Fin de la clase VentanaPrincipal
