package models;

public interface IMovieCatalog {
	void showMovies(); // Mostrar películas listadas.
	void findMovie(String name); // Mostar película según nombre.
	void insertMovie(Movie movie); // Insertar película.
}
