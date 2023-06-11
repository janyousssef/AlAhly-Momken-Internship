package i_hate_rest.jan;

import java.util.ArrayList;
import java.util.List;

public class AlienRepo {
	List<Alien> aliens;

	public AlienRepo() {
		aliens = new ArrayList<Alien>();
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setAge(20);
		a1.setName("jAlien");
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setAge(23);
		a2.setName("XAlien");
		aliens.add(a1);
		aliens.add(a2);
	}

	public List<Alien> getAliens() {
		return aliens;
	}

	public Alien getAlien(int id) {

		for (Alien a : aliens) {
			if (a.getId() == id)
				return a;
		}
		return null;
	}

	public void createAlien(Alien a) {
		aliens.add(a);

	}
}
