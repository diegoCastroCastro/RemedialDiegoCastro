package ec.ups.edu.RemedialDiegoCastro.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.ups.edu.RemedialDiegoCastro.modelo.Libro;
import ec.ups.edu.RemedialDiegoCastro.negocio.GestionBibliotecaON;

@Named
@RequestScoped
public class LibrosBean {

	private Libro newLibro;
	private List<Libro> libros;
	
	@Inject
	private GestionBibliotecaON on;
	
	public LibrosBean() {
		init();
	}

	@PostConstruct
	public void reloadLibros() {
		newLibro = new Libro();
		libros = on.getLibros();
		System.out.println(libros);
	}
	
	private void init() {
		newLibro = new Libro();
	}

	public Libro getNewLibro() {
		return newLibro;
	}

	public void setNewLibro(Libro newLibro) {
		this.newLibro = newLibro;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public GestionBibliotecaON getOn() {
		return on;
	}

	public void setOn(GestionBibliotecaON on) {
		this.on = on;
	}
	
	/*Metodo para el boton de registroLibro*/
	public String doGuardar () {
		System.out.println(newLibro);
		try {
			on.registrarLibro(newLibro);
			
			System.out.println("Guardado con exito");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al guardar " + e.getMessage());
		}
		return "listado-libros";
	}
}
