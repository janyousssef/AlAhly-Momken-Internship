import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.FailingStudent;

public class main {

	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa training");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		FailingStudent fs1= new FailingStudent(1, "gembo", 23000L, 1.6F, 2000);
		FailingStudent fs2= new FailingStudent(2, "kareem", 22000L, 1.2F, 2500);
		FailingStudent fs3= new FailingStudent(3, "mahmoud", 25000L, 1.8F, 3000);
		FailingStudent fs4= new FailingStudent(4, "mustafa", 28000L, 1.1F, 2000);
		HonorStudent hs1=new HonorStudent(1, "jan", 23000, 13);
		HonorStudent hs2=new HonorStudent(2, "ayoub", 23000, 19);
		HonorStudent hs3=new HonorStudent(3, "amr", 23000, 8);
		em.persist(fs1);
		em.persist(fs2);
		em.persist(fs3);
		em.persist(fs4);
		em.persist(hs1);
		em.persist(hs2);
		em.persist(hs3);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
