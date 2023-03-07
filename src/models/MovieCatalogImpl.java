package models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MovieCatalogImpl implements IMovieCatalog {

	// Atributos
	private final ArrayList<String> movies; // Listado de películas.

	// Constructores
	public MovieCatalogImpl() {
		this.movies = new ArrayList<>();
	}

	// Métodos
	public void insertMovie(Movie movie) {
		this.movies.add(movie.toString());
	}

	public void findMovie(String name) {
		String result = "";

		for (String movieName : this.movies) {
			if (movieName.equalsIgnoreCase(name)) {
				result = movieName;
				break;
			}
		}

		if (result.equalsIgnoreCase(name)) {
			JOptionPane.showMessageDialog(
				null,
				"Resultado encontrado: " + result + ".",
				"Buscar película",
				JOptionPane.QUESTION_MESSAGE
			);
		} else {
			JOptionPane.showMessageDialog(null, "¡Película no encontrada!", "Buscar película", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void showMovies() {
		JOptionPane.showMessageDialog(null, this.movies, "Lista de películas", JOptionPane.INFORMATION_MESSAGE);
	}
}
