package ec.ups.edu.RemedialDiegoCastro.negocio;

import java.util.List;

import javax.ejb.Local;

import ec.ups.edu.RemedialDiegoCastro.modelo.Autor;
import ec.ups.edu.RemedialDiegoCastro.modelo.Categoria;
import ec.ups.edu.RemedialDiegoCastro.modelo.Libro;

@Local
public interface GestionBibliotecaONLocal {

	public boolean registrarAutor (Autor autor) throws Exception;
	public boolean registrarCategoria (Categoria categoria) throws Exception;
	public boolean registrarLibro (Libro libro) throws Exception;
	public List<Autor> getAutores();
	public List<Categoria> getCategorias();
	public List<Libro> getLibros();
}
