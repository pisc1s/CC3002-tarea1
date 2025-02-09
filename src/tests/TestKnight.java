package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKnight extends TestConstructors {

	@Test
	public void testAssassinAttack() {
		a.battle(e);
		assertEquals(e.getReceivedDamage(), 50);
		assertEquals(e.getAttackPoints(), 500);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 4950);
		assertTrue(e.isAbstractCardAlive());
	}

	@Test
	public void testDruidAttack() {
		b.battle(e);
		assertEquals(e.getReceivedDamage(), 100);
		assertEquals(e.getAttackPoints(), 700);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 4900);
		assertTrue(e.isAbstractCardAlive());
	}

	@Test
	public void testHealerHunterMageAttack() {
		c.battle(e);
		assertEquals(e.getReceivedDamage(), 0);
		assertEquals(e.getAttackPoints(), 500);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 5000);
		assertTrue(e.isAbstractCardAlive());
		d.battle(e);
		assertEquals(e.getReceivedDamage(), 800);
		assertEquals(e.getAttackPoints(), 500);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 4200);
		assertTrue(e.isAbstractCardAlive());
		f.battle(e);
		assertEquals(e.getReceivedDamage(), 1400);
		assertEquals(e.getAttackPoints(), 500);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 3600);
		assertTrue(e.isAbstractCardAlive());
	}

	@Test
	public void testPaladinAttack() {
		g.battle(e);
		assertEquals(e.getReceivedDamage(), 0);
		assertEquals(e.getAttackPoints(), 733);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 5000);
		assertTrue(e.isAbstractCardAlive());
	}

	@Test
	public void testShamanAttack() {
		h.battle(e);
		assertEquals(e.getReceivedDamage(), 266);
		assertEquals(e.getAttackPoints(), 234);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 4734);
		assertTrue(e.isAbstractCardAlive());
	}

	@Test
	public void testWarlockAttack() {
		i.battle(e);
		assertEquals(e.getReceivedDamage(), 900);
		assertEquals(e.getAttackPoints(), 500);
		assertEquals(e.getLifePoints() - e.getReceivedDamage(), 4100);
		assertTrue(e.isAbstractCardAlive());
	}
}