package ec.ups.edu.RemedialDiegoCastro.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.RemedialDiegoCastro.modelo.Categoria;

@Stateless
public class CategoriaDAO {
	
	@Inject
	private EntityManager em;
	
	public boolean insert (Categoria entity) {
		em.persist(entity);
		return true;
	}
	
	public boolean update (Categoria entity) {
		em.merge(entity);
		return true;
	}
	
	public Categoria read (int id) {
		Categoria categoria =  em.find(Categoria.class, id);
		return categoria;
	}
	
	public boolean delete (int id) {
		Categoria categoria =  em.find(Categoria.class, id);
		em.remove(categoria);
		return true;
	}
	
	public List<Categoria> getList(){
		String jpql = "SELECT v FROM Categoria v";
		Query q = em.createQuery(jpql, Categoria.class);
		return q.getResultList();
	}

}
