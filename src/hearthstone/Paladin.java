package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type paladin
 * 
 * @author rglopez
 */
public class Paladin extends AbstractCard {

	public Paladin(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithPaladin(this);
		}
	}

	@Override
	public void battleWithKnight(Knight c) {
		c.regularAttack(this, c.getAttackPoints() / 2);
	}

	@Override
	public void battleWithMage(Mage c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}

}
