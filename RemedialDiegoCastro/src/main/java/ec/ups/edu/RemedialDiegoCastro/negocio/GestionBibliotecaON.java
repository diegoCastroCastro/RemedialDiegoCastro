package ec.ups.edu.RemedialDiegoCastro.negocio;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.RemedialDiegoCastro.dao.AutorDAO;
import ec.ups.edu.RemedialDiegoCastro.dao.CategoriaDAO;
import ec.ups.edu.RemedialDiegoCastro.dao.LibroDAO;
import ec.ups.edu.RemedialDiegoCastro.modelo.Autor;
import ec.ups.edu.RemedialDiegoCastro.modelo.Categoria;
import ec.ups.edu.RemedialDiegoCastro.modelo.Libro;



@Stateless
public class GestionBibliotecaON implements GestionBibliotecaONLocal {
	
	@Inject
	private AutorDAO daoAutor;
	
	@Inject
	private CategoriaDAO daoCategoria;
	
	@Inject
	private LibroDAO daoLibro;
	
	public boolean registrarAutor (Autor autor) throws Exception{
		try {
			daoAutor.insert(autor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar autor");
		}
		return true;
		
	}
	
	public boolean registrarCategoria (Categoria categoria) throws Exception{
		try {
			daoCategoria.insert(categoria);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar categoria");
		}
		return true;
		
	}
	
	public boolean registrarLibro (Libro libro) throws Exception{
		try {
			daoLibro.insert(libro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar libro");
		}
		return true;
		
	}
	
	public List<Autor> getAutores(){
		return daoAutor.getList();
	}
	
	public List<Categoria> getCategorias(){
		return daoCategoria.getList();
	}
	
	public List<Libro> getLibros(){
		return daoLibro.getList();
	}
	

}
