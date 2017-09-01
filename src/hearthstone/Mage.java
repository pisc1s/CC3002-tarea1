package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type mage
 * 
 * @author rglopez
 */

public class Mage extends AbstractCard {

	public Mage(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithMage(this);
		}
	}

	@Override
	public void battleWithAssassin(Assassin c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}

	@Override
	public void battleWithWarlock(Warlock c) {
		c.regularAttack(this, c.getAttackPoints() / 2);
	}

}
