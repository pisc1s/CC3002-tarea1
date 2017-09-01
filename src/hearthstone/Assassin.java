package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type assassin
 * 
 * @author rglopez
 */
public class Assassin extends AbstractCard {

	public Assassin(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithAssassin(this);
		}
	}

	@Override
	public void battleWithDruid(Druid c) {
		this.updateAttackPoints(c.getAttackPoints() / 2);
	}

	@Override
	public void battleWithWarlock(Warlock c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}
}
