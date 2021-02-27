package ec.ups.edu.RemedialDiegoCastro.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Categoria {
	
	@Id
	private int id;
	private String categoria;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_libro")
	private Libro libro;

}
