package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDruid extends TestConstructors {

	@Test
	public void testAssassinHealerAttack() {
		a.battle(b);
		assertEquals(b.getReceivedDamage(), 100);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 1900);
		assertTrue(b.isAbstractCardAlive());
		c.battle(b);
		assertEquals(b.getReceivedDamage(), -50);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 2050);
		assertTrue(b.isAbstractCardAlive());
	}

	@Test
	public void testHunterKnightMageAttack() {
		d.battle(b);
		assertEquals(b.getReceivedDamage(), 400);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 1600);
		assertTrue(b.isAbstractCardAlive());
		e.battle(b);
		assertEquals(b.getReceivedDamage(), 900);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 1100);
		assertTrue(b.isAbstractCardAlive());
		f.battle(b);
		assertEquals(b.getReceivedDamage(), 1500);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 500);
		assertTrue(b.isAbstractCardAlive());
	}

	@Test
	public void testPaladinAttack() {
		g.battle(b);
		assertEquals(b.getReceivedDamage(), -466);
		assertEquals(b.getAttackPoints(), 666);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 2466);
		assertTrue(b.isAbstractCardAlive());
	}

	@Test
	public void testShamanAttack() {
		h.battle(b);
		assertEquals(b.getReceivedDamage(), 533);
		assertEquals(b.getAttackPoints(), -333);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 1467);
		assertTrue(b.isAbstractCardAlive());
	}

	@Test
	public void testWarlockAttack() {
		i.battle(b);
		assertEquals(b.getReceivedDamage(), 900);
		assertEquals(b.getAttackPoints(), 200);
		assertEquals(b.getLifePoints() - b.getReceivedDamage(), 1100);
		assertTrue(b.isAbstractCardAlive());
	}
}
