package hearthstone;

/**
 * Simulates a card's behavior and characteristics
 * 
 * @author rglopez
 */

public abstract class AbstractCard implements Hearthstone {
	private String name;
	private int lifePoints;
	private int receivedDamage;
	private int attackPoints;

	/**
	 * Constructor for an <code>AbstractCard</code>
	 * 
	 * @param n
	 *            card's name
	 * @param p
	 *            card's life points
	 * @param a
	 *            card's attack points
	 */

	public AbstractCard(String n, int p, int a) {
		name = n;
		lifePoints = p;
		receivedDamage = 0;
		attackPoints = a;
	}

	/**
	 * Gets the name of a card
	 * 
	 * @return the card's name
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * Gets the life points of a card
	 * 
	 * @return the card's life points
	 */

	public int getLifePoints() {
		return this.lifePoints;
	}

	public int getReceivedDamage() {
		return this.receivedDamage;
	}

	public int getAttackPoints() {
		return this.attackPoints;
	}

	public void updateReceivedDamage(int amount) {
		this.receivedDamage = Math.max(this.receivedDamage + amount, 0);
	}

	public void updateAttackPoints(int amount) {
		this.attackPoints = Math.max(this.attackPoints + amount, 0);
	}

	public boolean isAbstractCardAlive() {
		if (this.getLifePoints() - this.getReceivedDamage() > 0) {
			return true;
		}
		return false;
	}

	public void regularAttack(Hearthstone c, int attackPoints) {
		c.updateReceivedDamage(attackPoints);
	}

	public void healerAttack(Hearthstone c, int attackPoints) {
		if (c.isAbstractCardAlive()) {
			c.updateReceivedDamage(-attackPoints / 2);
		}
	}

	public void druidAttack(Hearthstone c, int attackPoints) {
		c.updateAttackPoints(attackPoints);
		c.updateReceivedDamage(attackPoints / 2);
	}

	public void paladinAttack(Hearthstone c, int attackPoints) {
		c.updateAttackPoints(attackPoints / 3);
		c.updateReceivedDamage(-attackPoints / 3);

	}

	public void shamanAttack(Hearthstone c, int attackPoints) {
		c.updateAttackPoints(-attackPoints / 3);
		c.updateReceivedDamage(attackPoints / 3);
	}
}
