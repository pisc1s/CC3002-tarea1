package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type knight
 * 
 * @author rglopez
 */

public class Knight extends AbstractCard {

	public Knight(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithKnight(this);
		}
	}

	@Override
	public void battleWithAssassin(Assassin c) {
		c.regularAttack(this, c.getAttackPoints() / 2);
	}

	@Override
	public void battleWithHunter(Hunter c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}

}
