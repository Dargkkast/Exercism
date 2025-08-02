//
// This is only a SKELETON file for the 'D&D Character' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const abilityModifier = (ability) => {
  if (ability < 3)
    throw new Error('Ability scores must be at least 3')
  if (ability > 18)
    throw new Error('Ability scores can be at most 18')
  return Math.floor((ability-10) / 2)
};

export class Character {
  constructor() {
    const roll = () => [...Array(4)].map(Character.rollAbility).sort().slice(1).reduce((a, b) => a + b)
    this._strength = roll()
    this._dexterity = roll()
    this._constitution = roll()
    this._intelligence = roll()
    this._wisdom = roll()
    this._charisma = roll()
  }
  static rollAbility() {
    return Math.floor(Math.random() * 7)
  }

  get strength() {
    return this._strength
  }

  get dexterity() {
    return this._dexterity
  }

  get constitution() {
    return this._constitution
  }

  get intelligence() {
    return this._intelligence
  }

  get wisdom() {
    return this._wisdom
  }

  get charisma() {
    return this._charisma
  }

  get hitpoints() {
    return 10 + abilityModifier(this.constitution)
  }
}
