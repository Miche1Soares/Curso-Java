package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class App {

	public static void main(String[] args) {

		/*
		Pessoa p1 = new Pessoa (null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa (null, "Joaquim Torres", "joaquim@gmail.com"); 
		Pessoa p3= new Pessoa (null, "Ana Maria", "ana@gmail.com");
		*/

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		/*
		
		// INSERINDO NO BANCO DE DADOS

		em.getTransaction().begin();

		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		em.getTransaction().commit();
		*/



		/*
		
		// BUSCANDO NO BANCO DE DADOS

		Pessoa p = em.find(Pessoa.class, 2);

		System.out.println(p);

		*/



		// REMOVENDO DO BANCO DE DADOS

		// é necessário primeiro fazer a busca
		Pessoa p = em.find(Pessoa.class, 3);
		em.getTransaction().begin();;

		// para dps passar o objeto
		em.remove(p);

		em.getTransaction().commit();

		System.out.println("Pronto!");

		em.close();
		emf.close();

	}

}