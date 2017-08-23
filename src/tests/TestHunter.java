package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHunter extends TestConstructors {

	@Test
	public void testAssassinAttack() {
		a.battle(d);
		assertEquals(d.getReceivedDamage(), 100);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 3900);
		assertTrue(d.isAbstractCardAlive());
	}

	@Test
	public void testDruidAttack() {
		b.battle(d);
		assertEquals(d.getReceivedDamage(), 100);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 3900);
		assertTrue(d.isAbstractCardAlive());
	}

	@Test
	public void testHealerKnightMageAttack() {
		c.battle(d);
		assertEquals(d.getReceivedDamage(), 0);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 4000);
		assertTrue(d.isAbstractCardAlive());
		e.battle(d);
		assertEquals(d.getReceivedDamage(), 500);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 3500);
		assertTrue(d.isAbstractCardAlive());
		f.battle(d);
		assertEquals(d.getReceivedDamage(), 1700);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 2300);
		assertTrue(d.isAbstractCardAlive());
	}

	@Test
	public void testPaladinAttack() {
		g.battle(d);
		assertEquals(d.getReceivedDamage(), -233);
		assertEquals(d.getAttackPoints(), 633);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 4233);
		assertTrue(d.isAbstractCardAlive());
	}

	@Test
	public void testShamanAttack() {
		h.battle(d);
		assertEquals(d.getReceivedDamage(), 266);
		assertEquals(d.getAttackPoints(), 134);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 3734);
		assertTrue(d.isAbstractCardAlive());
	}

	@Test
	public void testWarlockAttack() {
		i.battle(d);
		assertEquals(d.getReceivedDamage(), 900);
		assertEquals(d.getAttackPoints(), 400);
		assertEquals(d.getLifePoints() - d.getReceivedDamage(), 3100);
		assertTrue(d.isAbstractCardAlive());
	}
}