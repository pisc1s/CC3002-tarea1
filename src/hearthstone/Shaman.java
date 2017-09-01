package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type shaman
 * 
 * @author rglopez
 */

public class Shaman extends AbstractCard {

	public Shaman(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithShaman(this);
		}
	}

	@Override
	public void battleWithHunter(Hunter c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}

}
