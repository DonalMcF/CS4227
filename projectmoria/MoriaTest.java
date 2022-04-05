package projectmoria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoriaTest {

	@Test
	void Monstertest() {
		 Monster Testmonster = new Monster("Goblin", "A grotesque, small enemy with a sub-par "
                + "skill-set. ", 30, 10, 15, 2, 10, true);
		 assertSame("Goblin", Testmonster.getName());
		 assertSame("A grotesque, small enemy with a sub-par "
                + "skill-set. ", Testmonster.getDescription());
		 assertEquals(30, Testmonster.getHitPoints());
		 assertEquals(10, Testmonster.getMinDamage());
		 assertEquals(15, Testmonster.getMaxDamage());
		 assertEquals(2, Testmonster.getDefense());
		 assertEquals(10, Testmonster.getCritChance());
	}
}
