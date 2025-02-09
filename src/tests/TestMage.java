package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMage extends TestConstructors {

	@Test
	public void testAssassinAttack() {
		a.battle(f);
		assertEquals(f.getReceivedDamage(), 200);
		assertEquals(f.getAttackPoints(), 600);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 5800);
		assertTrue(f.isAbstractCardAlive());
	}

	@Test
	public void testDruidAttack() {
		b.battle(f);
		assertEquals(f.getReceivedDamage(), 100);
		assertEquals(f.getAttackPoints(), 800);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 5900);
		assertTrue(f.isAbstractCardAlive());
	}

	@Test
	public void testHealerHunterKnightAttack() {
		c.battle(f);
		assertEquals(f.getReceivedDamage(), 0);
		assertEquals(f.getAttackPoints(), 600);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 6000);
		assertTrue(f.isAbstractCardAlive());
		d.battle(f);
		assertEquals(f.getReceivedDamage(), 400);
		assertEquals(f.getAttackPoints(), 600);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 5600);
		assertTrue(f.isAbstractCardAlive());
		e.battle(f);
		assertEquals(f.getReceivedDamage(), 900);
		assertEquals(f.getAttackPoints(), 600);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 5100);
		assertTrue(f.isAbstractCardAlive());
	}

	@Test
	public void testPaladinAttack() {
		g.battle(f);
		assertEquals(f.getReceivedDamage(), 0);
		assertEquals(f.getAttackPoints(), 833);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 6000);
		assertTrue(f.isAbstractCardAlive());
	}

	@Test
	public void testShamanAttack() {
		h.battle(f);
		assertEquals(f.getReceivedDamage(), 266);
		assertEquals(f.getAttackPoints(), 334);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 5734);
		assertTrue(f.isAbstractCardAlive());
	}

	@Test
	public void testWarlockAttack() {
		i.battle(f);
		assertEquals(f.getReceivedDamage(), 450);
		assertEquals(f.getAttackPoints(), 600);
		assertEquals(f.getLifePoints() - f.getReceivedDamage(), 5550);
		assertTrue(f.isAbstractCardAlive());
	}
}