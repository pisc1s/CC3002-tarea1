package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type warlock
 * 
 * @author rglopez
 */
public class Warlock extends AbstractCard {

	public Warlock(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithWarlock(this);
		}
	}

	@Override
	public void battleWithHealer(Healer c) {
		c.regularAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithShaman(Shaman c) {
		c.shamanAttack(this, 2 * c.getAttackPoints());
	}

}
