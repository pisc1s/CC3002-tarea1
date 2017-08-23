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
	public void battleWithAssassin(Assassin c) {
		c.regularAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithDruid(Druid c) {
		c.druidAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithHealer(Healer c) {
		c.regularAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithHunter(Hunter c) {
		c.regularAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithKnight(Knight c) {
		c.regularAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithMage(Mage c) {
		c.regularAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithPaladin(Paladin c) {
		c.paladinAttack(this, c.getAttackPoints());
	}

	@Override
	public void battleWithShaman(Shaman c) {
		c.shamanAttack(this, 2 * c.getAttackPoints());
	}

	@Override
	public void battleWithWarlock(Warlock c) {
		c.regularAttack(this, c.getAttackPoints());
	}

}
