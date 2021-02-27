package ec.ups.edu.RemedialDiegoCastro.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	private int id;
	private String nombreAutor;
	private List<Autor> listautor;
	
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
	public List<Autor> getListautor() {
		return listautor;
	}
	public void setListautor(List<Autor> listautor) {
		this.listautor = listautor;
	}
	
	
	
	
	
}
