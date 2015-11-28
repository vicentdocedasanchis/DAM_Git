import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JTextField;

public class Jugador {
	
	// Propiedades del jugador. Son privadas, sólo son accesibles a través de sus métodos
	private String nombre; // Almacenara el nombre de un jugador
	private String apellidos; // Almacenara los apellidos de un jugador
	private int puntuacion; // Almacenara la puntuacion del jugador
	private int edad; // Almacenara la edad del jugador

	public Jugador() {

	}// Fin del constructor.

	// Metodos setters y getters. Son públicos se puede acceder a las propiedades de la clase por medio de objetos de la clase
	// En general los set esperan un argumento(pon algo)y lo guardan
	// En general los get devuelven el argumento y lo muestran
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		
		this.edad = edad;
	}

}// Fin de la clase Jugador.
