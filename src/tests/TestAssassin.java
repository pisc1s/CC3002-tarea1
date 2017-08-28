package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssassin extends TestConstructors {

	@Test
	public void testDruidAttack() {
		b.battle(a);
		assertEquals(a.getReceivedDamage(), 0);
		assertEquals(a.getAttackPoints(), 200);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), 1000);
		assertTrue(a.isAbstractCardAlive());
	}

	@Test
	public void testHealerAttack() {
		c.battle(a);
		assertEquals(a.getReceivedDamage(), 0);
		assertEquals(a.getAttackPoints(), 100);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), 1000);
		assertTrue(a.isAbstractCardAlive());
	}

	@Test
	public void testHunterKnightMageAttack() {
		d.battle(a);
		assertEquals(a.getReceivedDamage(), 400);
		assertEquals(a.getAttackPoints(), 100);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), 600);
		assertTrue(a.isAbstractCardAlive());
		e.battle(a);
		assertEquals(a.getReceivedDamage(), 900);
		assertEquals(a.getAttackPoints(), 100);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), 100);
		assertTrue(a.isAbstractCardAlive());
		f.battle(a);
		assertEquals(a.getReceivedDamage(), 1500);
		assertEquals(a.getAttackPoints(), 100);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), -500);
		assertFalse(a.isAbstractCardAlive());
	}

	@Test
	public void testPaladinAttack() {
		g.battle(a);
		assertEquals(a.getReceivedDamage(), 0);
		assertEquals(a.getAttackPoints(), 333);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), 1000);
		assertTrue(a.isAbstractCardAlive());
	}

	@Test
	public void testShamanAttack() {
		h.battle(a);
		assertEquals(a.getReceivedDamage(), 266);
		assertEquals(a.getAttackPoints(), -166);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), 734);
		assertTrue(a.isAbstractCardAlive());
	}

	@Test
	public void testWarlockAttack() {
		i.battle(a);
		assertEquals(a.getReceivedDamage(), 1800);
		assertEquals(a.getAttackPoints(), 100);
		assertEquals(a.getLifePoints() - a.getReceivedDamage(), -800);
		assertFalse(a.isAbstractCardAlive());
	}
}
