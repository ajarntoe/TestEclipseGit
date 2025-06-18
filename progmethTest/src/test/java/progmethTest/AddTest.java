package progmethTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTest {

	Methodo m;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new Methodo();
	}

	@Test
	void testAdd01() {
		int r = m.add(4, 3);
		assertEquals(7,r);
			
	}
	
	@Test
	void testAdd02() {
		int r = m.add(-4, 3);
		assertEquals(-1,r);
			
	}

}
