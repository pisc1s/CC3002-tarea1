package tests;

import static org.junit.Assert.*;
import hearthstone.Assassin;
import hearthstone.Druid;
import hearthstone.Healer;
import hearthstone.Hunter;
import hearthstone.Knight;
import hearthstone.Mage;
import hearthstone.Paladin;
import hearthstone.Shaman;
import hearthstone.Warlock;

import org.junit.Before;
import org.junit.Test;

public class TestConstructors {
	protected Assassin a;
	protected Druid b;
	protected Healer c;
	protected Hunter d;
	protected Knight e;
	protected Mage f;
	protected Paladin g;
	protected Shaman h;
	protected Warlock i;

	@Before
	public void setUp() throws Exception {
		a = new Assassin("Wesley", 1000, 100);
		b = new Druid("Jonatan", 2000, 200);
		c = new Healer("Matt", 3000, 300);
		d = new Hunter("Marcus", 4000, 400);
		e = new Knight("Dan", 5000, 500);
		f = new Mage("Nanna", 6000, 600);
		g = new Paladin("Chris", 7000, 700);
		h = new Shaman("Luke", 8000, 800);
		i = new Warlock("Nate", 9000, 900);
	}

	@Test
	public void testConstructors1() {
		assertNotNull(a.getName());
		assertNotNull(e.getName());
		assertNotNull(i.getName());
		assertNotNull(b.getLifePoints());
		assertNotNull(c.getLifePoints());
		assertNotNull(d.getLifePoints());
		assertNotNull(f.getAttackPoints());
		assertNotNull(g.getAttackPoints());
		assertNotNull(h.getAttackPoints());
	}

	@Test
	public void testConstructors2() {
		assertFalse(a.getName().equals("Stelth"));
		assertFalse(b.getName().equals("Josiah"));
		assertFalse(c.getName().equals("Brad"));
		assertFalse(d.getName().equals("Ted"));
		assertFalse(e.getName().equals("Platz"));
		assertFalse(f.getName().equals("Brynjar"));
		assertFalse(g.getName().equals("Guy"));
		assertFalse(h.getName().equals("Ashton"));
		assertFalse(i.getName().equals("Jack"));
	}

	@Test
	public void testConstructors3() {
		assertEquals(a.getName(), "Wesley");
		assertEquals(b.getName(), "Jonatan");
		assertEquals(c.getName(), "Matt");
		assertEquals(d.getName(), "Marcus");
		assertEquals(e.getName(), "Dan");
		assertEquals(f.getName(), "Nanna");
		assertEquals(g.getName(), "Chris");
		assertEquals(h.getName(), "Luke");
		assertEquals(i.getName(), "Nate");
		assertEquals(a.getLifePoints(), 1000);
		assertEquals(b.getLifePoints(), 2000);
		assertEquals(c.getLifePoints(), 3000);
		assertEquals(d.getLifePoints(), 4000);
		assertEquals(e.getLifePoints(), 5000);
		assertEquals(f.getLifePoints(), 6000);
		assertEquals(g.getLifePoints(), 7000);
		assertEquals(h.getLifePoints(), 8000);
		assertEquals(i.getLifePoints(), 9000);
		assertEquals(a.getAttackPoints(), 100);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(c.getAttackPoints(), 300);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(e.getAttackPoints(), 500);
		assertEquals(f.getAttackPoints(), 600);
		assertEquals(g.getAttackPoints(), 700);
		assertEquals(h.getAttackPoints(), 800);
		assertEquals(i.getAttackPoints(), 900);

	}

}
