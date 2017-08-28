package hearthstone;

/**
 * Simulates a Hearthstone game
 * 
 * @author rglopez
 */

public interface Hearthstone {
	/**
	 * Gets the attack points of a card
	 * 
	 * @return the card's attack points
	 */
	public int getAttackPoints();

	/**
	 * Gets the received damage of a card
	 * 
	 * @return the card's received damage
	 */
	public int getReceivedDamage();

	/**
	 * Updates the field <code>receivedDamage</code> by adding the given amount
	 * to it
	 * 
	 * @param amount
	 *            number by which the field <code>receivedDamage</code> is
	 *            incremented
	 */
	public void updateReceivedDamage(int amount);

	/**
	 * Updates the field <code>attackPoints</code> by adding the given amount to
	 * it
	 * 
	 * @param amount
	 *            number by which the field <code>attackPoints</code> is
	 *            incremented
	 */
	public void updateAttackPoints(int amount);

	/**
	 * Returns false if an <code>AbstractCard</code> is out of the competition,
	 * and true otherwise
	 * 
	 * @return card's life status
	 */

	public boolean isAbstractCardAlive();

	/**
	 * Simulates an attack on any card performed by an <code>Assassin</code>, a
	 * <code>Warlock</code>, a <code>Knight</code>, a <code>Mage</code> or a
	 * <code>Hunter</code>, which consists of adding the
	 * <code>attackPoints</code> of the attacker onto the
	 * <code>receivedDamage</code> of the attacked
	 * 
	 * @param c
	 *            the card being attacked
	 * @param attackPoints
	 *            attacker's points
	 */

	public void regularAttack(Hearthstone c, int attackPoints);

	/**
	 * Simulates an attack on any card performed by a <code>Healer</code>, which
	 * consists of restoring the <code>receivedDamage</code> of the attacked by
	 * substracting half of the <code>attackPoints</code> of the
	 * <code>Healer</code>
	 * 
	 * @param c
	 *            the card being attacked
	 * @param attackPoints
	 *            attacker's points
	 */

	public void healerAttack(Hearthstone c, int attackPoints);

	/**
	 * Simulates an attack on any card performed by a <code>Druid</code>, which
	 * consists of incrementing the <code>attackPoints</code> of the attacked by
	 * the amount of <code>attackPoints</code> of the <code>Druid</code>, and
	 * also damaging it by half of the same amount
	 * 
	 * @param c
	 *            the card being attacked
	 * @param attackPoints
	 *            attacker's points
	 */

	public void druidAttack(Hearthstone c, int attackPoints);

	/**
	 * Simulates an attack on any card performed by a <code>Paladin</code>,
	 * which consists of incrementing the <code>attackPoints</code> and
	 * restoring the <code>receivedDamage</code> of the attacked by a third of
	 * the <code>attackPoints</code> of the <code>Paladin</code>
	 * 
	 * @param c
	 *            the card being attacked
	 * @param attackPoints
	 *            attacker's points
	 */

	public void paladinAttack(Hearthstone c, int attackPoints);

	/**
	 * Simulates an attack on any card performed by a <code>Shaman</code>, which
	 * consists of diminishing the <code>attackPoints</code> and incrementing
	 * the <code>receivedDamage</code> of the attacked by a third of the
	 * <code>attackPoints</code> of the <code>Shaman</code>
	 * 
	 * @param c
	 *            the card being attacked
	 * @param attackPoints
	 *            attacker's points
	 */

	public void shamanAttack(Hearthstone c, int attackPoints);

	/**
	 * Simulates a battle between two cards, in which <code>c</code> is the card
	 * being attacked by the other one
	 * 
	 * @param c
	 *            the card being attacked
	 */

	public void battle(Hearthstone c);

	/**
	 * Simulates a battle between an <code>Assassin</code> and any other card ,
	 * in which <code>c</code> is the card that attacks the other one. Takes
	 * into account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithAssassin(Assassin c);

	/**
	 * Simulates a battle between an <code>Druid</code> and any other card , in
	 * which <code>c</code> is the card that attacks the other one. Takes into
	 * account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithDruid(Druid c);

	/**
	 * Simulates a battle between an <code>Healer</code> and any other card , in
	 * which <code>c</code> is the card that attacks the other one. Takes into
	 * account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */
	public void battleWithHealer(Healer c);

	/**
	 * Simulates a battle between an <code>Hunter</code> and any other card , in
	 * which <code>c</code> is the card that attacks the other one. Takes into
	 * account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithHunter(Hunter c);

	/**
	 * Simulates a battle between an <code>Knight</code> and any other card , in
	 * which <code>c</code> is the card that attacks the other one. Takes into
	 * account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithKnight(Knight c);

	/**
	 * Simulates a battle between an <code>Mage</code> and any other card , in
	 * which <code>c</code> is the card that attacks the other one. Takes into
	 * account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithMage(Mage c);

	/**
	 * Simulates a battle between an <code>Paladin</code> and any other card ,
	 * in which <code>c</code> is the card that attacks the other one. Takes
	 * into account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithPaladin(Paladin c);

	/**
	 * Simulates a battle between an <code>Shaman</code> and any other card , in
	 * which <code>c</code> is the card that attacks the other one. Takes into
	 * account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithShaman(Shaman c);

	/**
	 * Simulates a battle between an <code>Warlock</code> and any other card ,
	 * in which <code>c</code> is the card that attacks the other one. Takes
	 * into account the special interactions between cards when necessary.
	 * 
	 * @param c
	 *            the card performing the attack
	 */

	public void battleWithWarlock(Warlock c);

}
