package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type druid
 * 
 * @author rglopez
 */
public class Druid extends AbstractCard {

	public Druid(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithDruid(this);
		}
	}

	@Override
	public void battleWithPaladin(Paladin c) {
		c.paladinAttack(this, 2 * c.getAttackPoints());
	}

	@Override
	public void battleWithShaman(Shaman c) {
		c.shamanAttack(this, 2 * c.getAttackPoints());
	}
}
