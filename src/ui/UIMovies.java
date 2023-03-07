package ui;

import javax.swing.JOptionPane;
import models.IMovieCatalog;
import models.Movie;
import models.MovieCatalogImpl;

public class UIMovies {

	// Inicializar interfaz de usuario
	public static void UserInterface() {
		IMovieCatalog movieCatalog = new MovieCatalogImpl();
		boolean exit = false;

		do {
			String menu = "1 - Insertar película.\n" + "2 - Mostrar películas.\n" + "3 - Buscar película.\n" + "4 - Salir.";
			String option = JOptionPane.showInputDialog(null, menu, "Ingrese una opción", JOptionPane.QUESTION_MESSAGE);

			switch (option) {
				case "1":
					insertMovie(movieCatalog);
					break;
				case "2":
					movieCatalog.showMovies();
					break;
				case "3":
					showMovie(movieCatalog);
					break;
				case "4":
					exit = true;
					break;
				default:
					JOptionPane.showMessageDialog(
						null,
						"¡Opción incorrecta! Vuelva a intentar...",
						"¡Error!",
						JOptionPane.ERROR_MESSAGE
					);
					break;
			}
		} while (!exit);
	}

	// Dialogo - Insertar película
	private static void insertMovie(IMovieCatalog movieCatalog) {
		String movieName = JOptionPane.showInputDialog(
			null,
			"Nombre de la película a insertar",
			"Insertar película",
			JOptionPane.QUESTION_MESSAGE
		);

		Movie movie = new Movie(movieName);
		movieCatalog.insertMovie(movie);
	}

	// Dialogo - Mostar película
	private static void showMovie(IMovieCatalog movieCatalog) {
		String movieName = JOptionPane.showInputDialog(
			null,
			"Nombre de la película a buscar",
			"Buscar película",
			JOptionPane.QUESTION_MESSAGE
		);

		movieCatalog.findMovie(movieName);
	}
}
