/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   <JOptionPane> se utiliza para crear ventanas de escritorio.
 *
 *
 * VALORES PARA ICONOS POSIBLES:
 *  			  				- JOptionPane.ERROR_MESSAGE --> 0.
 *  			  				- JOptionPane.WARNING_MESSAGE --> 1.
 *  			  				- JOptionPane.QUESTION_MESSAGE --> 2.
 *  			  				- JOptionPane.INFORMATION_MESSAGE --> 3.
-------------------------------------------------------------------------- */

import java.util.ArrayList;
import javax.swing.JOptionPane;
import ui.UIMovies;

public class Main {

	public static void main(String[] args) {
		// Ejemplo de diálogos (aplicación de escritorio)
		/*
			// Dialogo de entrada - Con interacción
			String value = JOptionPane.showInputDialog(
				null,
				"Ingrese un texto", // Contenido
				"Entrada", // Título
				JOptionPane.QUESTION_MESSAGE // Icono
			);
			
			// Dialogo de información - Sin interacción
			JOptionPane.showMessageDialog(
				null,
				value,
				"Mi mensaje",
				JOptionPane.ERROR_MESSAGE
			);
		*/

		UIMovies.UserInterface(); // Inicialización de la interfaz de usuario.
	}
}
