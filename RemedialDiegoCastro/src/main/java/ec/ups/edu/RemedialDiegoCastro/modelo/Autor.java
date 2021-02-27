package ec.ups.edu.RemedialDiegoCastro.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {

	@Id
	private int id;
	private String nombreAutor;
	@OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
	private List<Libro> libros = new ArrayList<Libro>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	
}
