package ec.ups.edu.RemedialDiegoCastro.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.RemedialDiegoCastro.modelo.Libro;

@Stateless
public class LibroDAO {
	
	@Inject
	private EntityManager em;
	
	public boolean insert (Libro entity) {
		em.persist(entity);
		return true;
	}

	public boolean update (Libro entity) {
		em.merge(entity);
		return true;
	}
	
	public Libro read (int id) {
		Libro libro =  em.find(Libro.class, id);
		return libro;
	}
	
	public boolean delete (int id) {
		Libro libro =  em.find(Libro.class, id);
		em.remove(libro);
		return true;
	}
	
	public List<Libro> getList(){
		String jpql = "SELECT v FROM Libro v";
		Query q = em.createQuery(jpql, Libro.class);
		return q.getResultList();
	}


}
