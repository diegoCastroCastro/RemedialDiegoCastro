package ec.ups.edu.RemedialDiegoCastro.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.RemedialDiegoCastro.modelo.Autor;


@Stateless
public class AutorDAO {

	@Inject
	private EntityManager em;
	
	public boolean insert (Autor entity) {
		em.persist(entity);
		return true;
	}

	public boolean update (Autor entity) {
		em.merge(entity);
		return true;
	}

	public Autor read (int id) {
		Autor autor =  em.find(Autor.class, id);
		return autor;
	}

	public boolean delete (int id) {
		Autor autor =  em.find(Autor.class, id);
		em.remove(autor);
		return true;
	}
	
	public List<Autor> getList(){
		String jpql = "SELECT v FROM Autor v";
		Query q = em.createQuery(jpql, Autor.class);
		return q.getResultList();
	}
}
