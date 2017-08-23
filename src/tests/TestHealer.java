package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHealer extends TestConstructors {

	@Test
	public void testAssassinAttack() {
		a.battle(c);
		assertEquals(c.getReceivedDamage(), 200);
		assertEquals(c.getAttackPoints(), 300);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 2800);
		assertTrue(c.isAbstractCardAlive());
	}

	@Test
	public void testDruidAttack() {
		b.battle(c);
		assertEquals(c.getReceivedDamage(), 100);
		assertEquals(c.getAttackPoints(), 500);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 2900);
		assertTrue(c.isAbstractCardAlive());
	}

	@Test
	public void testHunterKnightMageAttack() {
		d.battle(c);
		assertEquals(c.getReceivedDamage(), 400);
		assertEquals(c.getAttackPoints(), 300);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 2600);
		assertTrue(c.isAbstractCardAlive());
		e.battle(c);
		assertEquals(c.getReceivedDamage(), 900);
		assertEquals(c.getAttackPoints(), 300);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 2100);
		assertTrue(c.isAbstractCardAlive());
		f.battle(c);
		assertEquals(c.getReceivedDamage(), 1500);
		assertEquals(c.getAttackPoints(), 300);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 1500);
		assertTrue(c.isAbstractCardAlive());
	}

	@Test
	public void testPaladinAttack() {
		g.battle(c);
		assertEquals(c.getReceivedDamage(), -466);
		assertEquals(c.getAttackPoints(), 766);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 3466);
		assertTrue(c.isAbstractCardAlive());
	}

	@Test
	public void testShamanAttack() {
		h.battle(c);
		assertEquals(c.getReceivedDamage(), 266);
		assertEquals(c.getAttackPoints(), 34);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 2734);
		assertTrue(c.isAbstractCardAlive());
	}

	@Test
	public void testWarlockAttack() {
		i.battle(c);
		assertEquals(c.getReceivedDamage(), 900);
		assertEquals(c.getAttackPoints(), 300);
		assertEquals(c.getLifePoints() - c.getReceivedDamage(), 2100);
		assertTrue(c.isAbstractCardAlive());
	}
}
