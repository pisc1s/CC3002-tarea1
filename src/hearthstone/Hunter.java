package hearthstone;

/**
 * Simulates the behavior and characteristics of a card of type hunter
 * 
 * @author rglopez
 */
public class Hunter extends AbstractCard {

	public Hunter(String n, int p, int a) {
		super(n, p, a);
	}

	@Override
	public void battle(Hearthstone c) {
		if (this.isAbstractCardAlive() && c.isAbstractCardAlive()) {
			c.battleWithHunter(this);
		}
	}

	@Override
	public void battleWithDruid(Druid c) {
		this.updateReceivedDamage(c.getAttackPoints() / 2);
	}

	@Override
	public void battleWithMage(Mage c) {
		c.regularAttack(this, 2 * c.getAttackPoints());
	}

}
