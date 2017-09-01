package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type healer
 * 
 * @author rglopez
 */
public class Healer extends AbstractCard {

	public Healer(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithHealer(this);
		}
	}

	@Override
	public void battleWithAssassin(Assassin c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}

	@Override
	public void battleWithPaladin(Paladin c) {
		c.paladinAttack(this, 2 * c.getAttackPoints());
	}
}
