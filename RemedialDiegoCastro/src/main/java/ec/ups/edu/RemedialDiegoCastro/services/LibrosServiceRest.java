package ec.ups.edu.RemedialDiegoCastro.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.ups.edu.RemedialDiegoCastro.modelo.Libro;
import ec.ups.edu.RemedialDiegoCastro.negocio.GestionBibliotecaONLocal;


@Path("libros")
public class LibrosServiceRest {

	@Inject
	private GestionBibliotecaONLocal on;
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Mensaje guardar(Libro libro) {
		Mensaje m = new Mensaje();
		try {
			on.registrarLibro(libro);
			m.setCode("OK");
			m.setMenssage("Registro guardado satisfactoriamente");
			return m;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.setCode("ERROR");
			m.setMenssage(e.getMessage());
			return m;
		}
	}
	
	@GET
	@Produces("application/json")
	@Path("libros")
	public List<Libro> getLibros(){
		return on.getLibros();
	}
	
}
