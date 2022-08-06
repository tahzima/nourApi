package ma.marsamaroc.pfaNour;

import ma.marsamaroc.pfaNour.Dao.EnginDao;
import ma.marsamaroc.pfaNour.Dao.NavireDao;
import ma.marsamaroc.pfaNour.Dao.UtilisateurDao;
import ma.marsamaroc.pfaNour.Beans.Engin;
import ma.marsamaroc.pfaNour.Beans.Navire;
import ma.marsamaroc.pfaNour.Beans.Utilisateur;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PfaNourApplicationTests {
	@Autowired
	private NavireDao navireDao;
	private EnginDao enginDao;
	private UtilisateurDao utilisateurDao;

	@Test
	void contextLoads() {
	}

	@Test
	public void testListNavires() {
		List<Navire> nav = navireDao.findAll();
		for (Navire n : nav)
			System.out.println(n);
	}

	@Test
	public void testListEngins() {
		List<Engin> eng = enginDao.findAll();
		for (Engin e : eng)
			System.out.println(e);
	}

	@Test
	public void testListUtilisateurs() {
		List<Utilisateur> uti = utilisateurDao.findAll();
		for (Utilisateur u : uti)
			System.out.println(u);
	}
	@Test
	public void testFindNavire() {
		Navire nav = navireDao.findById(5L).get();
		System.out.println(nav);
	}
	@Test
	public void testFindEngin() {
		Engin e = enginDao.findById(1L).get();
		System.out.println(e);
	}
	@Test
	public void testFindUtilisateur() {
		Utilisateur u = utilisateurDao.findById(1L).get();
		System.out.println(u);
	}
}