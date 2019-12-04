import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NavireTest {

	private Navire navire1;
	private Navire navire2;
	private Navire navire3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.navire1 = new Navire(5, "Porte-Avion", new Coordonne(2,3), Direction.SUD);
		this.navire2 = new Navire(5, "Porte-Avion", new Coordonne(2,3), Direction.SUD);
		this.navire3 = new Navire(5, "Porte-Avion", new Coordonne(2,3), Direction.NORD);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEqual() {
		assertTrue(this.navire1.equals(this.navire2));
		assertFalse(this.navire2.equals(this.navire3));
	}

}
